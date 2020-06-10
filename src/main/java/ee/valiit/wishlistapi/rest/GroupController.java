package ee.valiit.wishlistapi.rest;

import ee.valiit.wishlistapi.dto.GroupDto;
import ee.valiit.wishlistapi.model.Group;
import ee.valiit.wishlistapi.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/groups")
@CrossOrigin
public class GroupController {

    @Autowired
    GroupService groupService;

    @GetMapping
    public List<GroupDto> getGroups() {
        return groupService.getGroups();
    }

    @GetMapping("/{id}")
    public GroupDto getGroup(@PathVariable("id") int id) {
        return groupService.getGroup(id);
    }

    @GetMapping("{id}/{groupId}")
    public GroupDto getGroupByUserAndGroupId(@PathVariable("id") int id, @PathVariable("groupId") int groupId) {
        return groupService.getGroupByUserAndGroupId(id, groupId);
    }

    @PostMapping("/add")
    public void saveEditGroup(@RequestBody GroupDto groupDto) {
        groupService.saveEditGroup(groupDto);
    }

    @DeleteMapping("/{id}")
    public void deleteGroup(@PathVariable("id") int id) {
        groupService.deleteGroup(id);
    }
}

