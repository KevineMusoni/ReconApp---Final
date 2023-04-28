package com.example.demo.service;


import com.example.demo.model.Items;

import java.util.List;


public interface ItemService{
    List<Items> list(int limit);
}
