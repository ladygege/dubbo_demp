package com.example.dubboapi;

import java.util.List;

/**
 *
 */
public interface DemoService {
    List<String> getPermissions(Long id);
}
