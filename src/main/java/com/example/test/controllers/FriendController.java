package com.example.test.controllers;

import com.example.test.DAO.FriendDAO;
import com.example.test.Models.Friend;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Sara Carlsson
 * Date: 08/04/2021
 * Time:14:39
 * Project: test
 * Copywright: MIT
 */
@RestController
public class FriendController {
    FriendDAO fDAO = new FriendDAO();
    List<Friend> friends= fDAO.getAllFriends();

    @RequestMapping("/friends")
    public List<Friend> friends(){
        return friends;
    }

    @RequestMapping("/friend/{id}")
    public Friend friend(@PathVariable int id){
        return friends.stream()
                .filter(e -> e.getId()==id)
                .findAny()
                .orElse(null);
    }

    @RequestMapping("/friend/{id}/delete")
    public List<Friend> deleteFriend(@PathVariable int id){
        friends.removeIf(e -> e.getId()==id);
        return friends;
    }

    @PostMapping("/friend/add")
    public String addFriend(@RequestBody Friend friend){
        friends.add(friend);
        return friend.getNamn() + " är nu tillagd";
    }

    @PostMapping("/friend/update")
    public String updateFriend(@RequestBody Friend friend){
        Friend f = friends.stream()
                .filter(e -> e.getId()== friend.getId())
                .findAny()
                .orElse(null);
        if(f==null){
            addFriend(friend);
            return "Du har lagt till " + friend.getNamn();
        }
        else{
            friends.set(friends.indexOf(f), friend);
            return friend.getNamn() + " är uppdaterad";
        }
    }
}
