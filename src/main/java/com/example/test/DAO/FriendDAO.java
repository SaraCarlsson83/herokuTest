package com.example.test.DAO;

import com.example.test.Models.Friend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Sara Carlsson
 * Date: 08/04/2021
 * Time:14:40
 * Project: test
 * Copywright: MIT
 */
public class FriendDAO {

    public List<Friend> getAllFriends(){
        List<Friend> friends = new LinkedList<>();
        friends.add(new Friend(1, "F1", "A1", "T1"));
        friends.add(new Friend(2, "F2", "A2", "T2"));
        friends.add(new Friend(3, "F3", "A2", "T2"));
        friends.add(new Friend(4, "F4", "A3", "T1"));
        friends.add(new Friend(5, "F5", "A4", "T1"));

        return friends;
    }
}
