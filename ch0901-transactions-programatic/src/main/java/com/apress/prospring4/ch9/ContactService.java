package com.apress.prospring4.ch9;

import java.util.List;

/**
 * Author: 王俊超
 * Date: 2015-12-18
 * Time: 16:04
 * Declaration: All Rights Reserved !!!
 */
public interface ContactService {
    List<Contact> findAll();
    Contact findById(Long id);
    Contact save(Contact contact);
    long countAll();
}
