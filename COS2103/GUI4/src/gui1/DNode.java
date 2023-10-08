/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui1;

/**
 *
 * @author user
 */
public class DNode {

    Employee INFOR;
    DNode BACK = null;
    DNode FORW = null;

    DNode(Employee INFOR){
    this.INFOR = INFOR;
    }
    
}
