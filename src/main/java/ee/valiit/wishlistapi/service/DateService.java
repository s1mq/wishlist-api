package ee.valiit.wishlistapi.service;

import ee.valiit.wishlistapi.dto.DateDto;
import ee.valiit.wishlistapi.model.Date;
import ee.valiit.wishlistapi.repository.DateRepository;
import ee.valiit.wishlistapi.util.Transformer;
import io.jsonwebtoken.lang.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DateService {

    @Autowired
    private DateRepository dateRepository;

    public List<DateDto> getDates() {
        return dateRepository.getDates().stream().map(Transformer::toDateDto).collect(Collectors.toList());
    }

    public DateDto getDate(int id) {
        Assert.isTrue(id > 0, "Date ID not specified");
        Date date = dateRepository.getDate(id);
        return Transformer.toDateDto(date);
    }

    public DateDto getDateByUserAndDateId(int id, int dateId) {
        Assert.isTrue(id > 0, "User ID not specified");
        Assert.isTrue(dateId > 0, "Date ID not specified");
        Date date = dateRepository.getDateByUserAndDateId(id, dateId);
        return Transformer.toDateDto(date);

    }

    public void saveEditDate(DateDto dateDto) {
        Assert.notNull(dateDto, "Date not specified");
        Assert.hasText(dateDto.getName(), "Date name not specified");
//        Assert.isTrue(dateDto.getDate() == null || dateDto.getDate().isBefore(LocalDate.now()),
//                "Date has to be in the past");

        Date date = Transformer.toDateModel(dateDto);
        if (date.getId() != 0 && date.getId() > 0) {
            dateRepository.updateDate(date);
        } else {
//            Assert.isTrue(!dateRepository.dateExists(date), "Date with specified name already exists");
            dateRepository.addDate(date);
        }
    }

    public void deleteDate(int id) {
        if (id > 0) {
            dateRepository.deleteDate(id);
        }
    }


}
