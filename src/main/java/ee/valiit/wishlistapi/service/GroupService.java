package ee.valiit.wishlistapi.service;

import ee.valiit.wishlistapi.dto.GroupDto;
import ee.valiit.wishlistapi.model.Group;
import ee.valiit.wishlistapi.repository.GroupRepository;
import ee.valiit.wishlistapi.util.Transformer;
import io.jsonwebtoken.lang.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GroupService {

    @Autowired
    GroupRepository groupRepository;

    public List<GroupDto> getGroups(){
        return groupRepository.getGroups().stream().map(Transformer::toGroupDto).collect(Collectors.toList());
    }

    public GroupDto getGroup(int id){
        Assert.isTrue(id > 0, "Group ID not specified");
        Group group = groupRepository.getGroup(id);
        return Transformer.toGroupDto(group);
    }

    public GroupDto getGroupByUserAndGroupId(int id, int groupId) {
        Assert.isTrue(id > 0, "User ID not specified");
        Assert.isTrue(groupId > 0, "Group ID not specified");
        Group group = groupRepository.getGroupByUserAndGroupId(id, groupId);
        return Transformer.toGroupDto(group);
    }

    public void saveEditGroup(GroupDto groupDto) {
        Assert.notNull(groupDto, "Group not specified");
        Assert.hasText(groupDto.getName(), "Group name not specified");
        Group group = Transformer.toGroupModel(groupDto);
        if (group.getId() != 0 && group.getId() > 0) {
            groupRepository.updateGroup(group);
        } else {
            Assert.isTrue(!groupRepository.groupExists(group), "Group with specified name already exists");
            groupRepository.addGroup(group);
        }
    }

    public void deleteGroup(int id) {
        if (id > 0) {
            groupRepository.deleteGroup(id);
        }
    }


}
