/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package za.ac.tut.business;

import java.util.List;
import javax.ejb.Stateless;
import javax.servlet.http.HttpSession;
import za.ac.tut.item.Item;

/**
 *
 * @author tresorkl
 */
@Stateless
public class BusinessEJB implements BusinessEJBLocal {

    @Override
    public List<Item> updatedCard(HttpSession session, Item newItem) {
        
        
        List<Item> oldItemList = (List<Item>)session.getAttribute("items");
        oldItemList.add(newItem);
        
       List<Item> newItemList = oldItemList;
       
       
       session.setAttribute("items", newItemList);
       
        
        
        return newItemList;
        
        
        
    }

    @Override
    public int determineAmountDue(List<Item> items) {
        
        int totAmountDue = 0;
        
        for (int i =0; i<items.size(); i++){
        
            totAmountDue +=items.get(i).amountDue();
            
        }
        
        return totAmountDue;
        
    }

    
    
    
}
