package ee.valiit.wishlistapi.rest;

import ee.valiit.wishlistapi.dto.ClientDto;
import ee.valiit.wishlistapi.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
@CrossOrigin
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("/{user}")
    public ClientDto getClient(@PathVariable("user") String user) {
        return clientService.getClient(user);
    }

    @GetMapping("/group/{groupId}")
    public List<ClientDto> getClientsByGroup(@PathVariable("groupId") int groupId) {
        return clientService.getClientsByGroup(groupId);
    }
}
