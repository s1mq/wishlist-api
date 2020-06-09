package ee.valiit.wishlistapi.rest;

import ee.valiit.wishlistapi.dto.DateDto;
import ee.valiit.wishlistapi.service.DateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dates")
@CrossOrigin
public class DateController {

    @Autowired
    private DateService dateService;

    @GetMapping
    public List<DateDto> getDates() {
        return dateService.getDates();
    }

    @GetMapping("/{id}")
    public DateDto getDate(@PathVariable("id") int id) {
        return dateService.getDate(id);
    }

    @GetMapping("/{id}/{dateId}")
    public DateDto getDateByUserAndDateId(@PathVariable("id") int id, @PathVariable("dateId") int dateId) {
        return dateService.getDateByUserAndDateId(id, dateId);
    }

    @PostMapping("/add")
    public void saveEditDate(@RequestBody DateDto dateDto) {
        dateService.saveEditDate(dateDto);
    }

    @DeleteMapping("/{id}")
    public void deleteDate(@PathVariable("id") int id ) {
        dateService.deleteDate(id);
    }



}
