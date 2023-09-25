/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cos2103week10;

/**
 *
 * @author MILLIONx
 */
public class COS2103week10 {

    /**
     * @param args the command line arguments
     */

/**
 *
 * @author ComSCIv3400
 */
    public static void main(String[] args) {
                Node START;
        Node NodeA = new Node();
        NodeA.INFOR = 50;
        Node NodeB = new Node();
        NodeB.INFOR = 12;
        Node NodeC = new Node();
        NodeC.INFOR = 56;
        //เชื่อมโยงลิงค์ลิสต์
        START = NodeA;
        NodeA.LINK = NodeB;
        NodeB.LINK = NodeC;
        System.out.println(NodeA.INFOR);
        System.out.println(NodeB.INFOR);
        System.out.println(NodeC.INFOR);
    }
    
}
