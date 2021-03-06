package ee.valiit.wishlistapi.service;

import ee.valiit.wishlistapi.dto.ClientDto;
import ee.valiit.wishlistapi.model.Date;
import ee.valiit.wishlistapi.model.Group;
import ee.valiit.wishlistapi.model.User;
import ee.valiit.wishlistapi.model.WishlistItem;
import ee.valiit.wishlistapi.repository.DateRepository;
import ee.valiit.wishlistapi.repository.GroupRepository;
import ee.valiit.wishlistapi.repository.UserRepository;
import ee.valiit.wishlistapi.repository.WishlistItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    DateRepository dateRepository;

    @Autowired
    WishlistItemRepository wishlistItemRepository;

    @Autowired
    GroupRepository groupRepository;

    public ClientDto getClient(String username){
        User user = userRepository.getUserByUsername(username);
        List<Date> dates = dateRepository.getDatesByUser(user.getId());
        List<WishlistItem> items = wishlistItemRepository.getWishlistItemsByUser(user.getId());
        List<Group> groups = groupRepository.getGroupsByUser(user.getId());
        ClientDto client = new ClientDto();
        client.setUserId(user.getId());
        client.setName(user.getName());
        client.setPhoto(user.getPhoto());
        client.setUuid(user.getUuid());
        client.setDates(dates);
        client.setWishlistItems(items);
        client.setGroups(groups);
        return client;
    }

    public ClientDto getClientById(int id) {
        User user = userRepository.getUserById(id);
        List<Date> dates = dateRepository.getDatesByUser(user.getId());
        List<WishlistItem> items = wishlistItemRepository.getWishlistItemsByUser(user.getId());
        ClientDto client = new ClientDto();
        client.setUserId(user.getId());
        client.setName(user.getName());
        client.setPhoto(user.getPhoto());
        client.setUuid(user.getUuid());
        client.setDates(dates);
        client.setWishlistItems(items);
        return client;
    }

    public List<ClientDto> getClientsByGroup(int groupId){
        List<User> usersByGroup = userRepository.getUsersByGroup(groupId);
        List<ClientDto> clientsByGroup = new ArrayList<>();
        for (User el : usersByGroup) {
            User user = userRepository.getUserByUsername(el.getUsername());
            List<Date> dates = dateRepository.getDatesByUser(user.getId());
            List<WishlistItem> items = wishlistItemRepository.getWishlistItemsByUser(user.getId());
            ClientDto client = new ClientDto();
            client.setUserId(user.getId());
            client.setName(user.getName());
            client.setPhoto(user.getPhoto());
            client.setUuid(user.getUuid());
            client.setDates(dates);
            client.setWishlistItems(items);
            clientsByGroup.add(client);
        }
        return clientsByGroup;
    }


}
