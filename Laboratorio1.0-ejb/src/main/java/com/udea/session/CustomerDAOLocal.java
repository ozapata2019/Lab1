/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.session;

import javax.ejb.Local;

/**
 *
 * @author 𝒞𝒜ℛℒ𝒪𝒮
 */
@Local
public interface CustomerDAOLocal {

    List<Customer> getAllCustomers();

    Customer update(Customer customer);

    Customer update(CustomerDAO customer);

    List<Customer> getAllCustomers();

    Customer update(Customer customer);
    
}
