/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package za.ac.tut.business;

import java.util.List;
import javax.ejb.Local;
import javax.servlet.http.HttpSession;
import za.ac.tut.item.Item;

/**
 *
 * @author tresorkl
 */
@Local
public interface BusinessEJBLocal {

    List<Item> updatedCard(HttpSession session,Item newItem);

    int determineAmountDue(List<Item> items);
    
}
