/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayhw1;

public class RUDoubleList {

    DNode START;
    DNode LAST;

    public void ForwardTraversingList() {
        DNode PTR = null;
        PTR = START;
        while (PTR != null) {
            System.out.println(PTR.INFOR);  //Apply PROCESS to INFOR[PTR]
            PTR = PTR.FORW;
        }
    }

    public void BackwardTraversingList() {
        DNode PTR = null;
        PTR = LAST;
        while (PTR != null) {
            System.out.println(PTR.INFOR);  //Apply PROCESS to INFOR[PTR]
            PTR = PTR.BACK;
        }
    }
 public void INSTFIRST(Object ITEM){   
        //Algorrithm 5.4 SEARCH  if AVAIL = NULL step. 1        
        DNode NEW=new DNode();   //step. 2        
        NEW.INFOR = ITEM;
        if(START==null) { //first Node
           START=NEW;
           LAST=NEW;
        }else{
          START.BACK = NEW;
          NEW.FORW = START;
          START=NEW;
        }
    }
 
    public void INSTWL(int loc, Object data) {
        DNode result[] = FINDB(loc);
        DNode LOCB = result[0];
        DNode LOCA = result[1];
        // System.out.println("LOCA:"+LOCA);
        // System.out.println("LOCB:"+LOCB);
        
        DNode NEW = new DNode();
        NEW.INFOR = data;
        if ((LOCA == null) && (LOCB == null)) { //first node
            START = NEW;
            LAST = NEW;
     //       System.out.println("First OK.");
        } else if ((LOCA == null) && (LOCB != null)) { //insert first
            NEW.FORW = LOCB;
            LOCB.BACK = NEW;
            START = NEW;
        } else if ((LOCA != null) && (LOCB == null)) { //insert last
            LOCA.FORW = NEW;
            NEW.BACK = LOCA;
            LAST = NEW;
        } else { //Normal insert
            LOCA.FORW = NEW;
            NEW.FORW = LOCB;
            LOCB.BACK = NEW;
            NEW.BACK = LOCA;
        }
    }

    public boolean DELTWL(int ITEM) {
    DNode LOC = SEARCH(ITEM);
    if (LOC != null) {
        if (LOC.BACK == null && LOC.FORW != null) { // Start node
            START = LOC.FORW;
            LOC.FORW.BACK = null;
            return true;
        } else if (LOC.FORW == null && LOC.BACK != null) { // Last node
            LOC.BACK.FORW = null;
            LAST = LOC.BACK; // Update LAST to the previous node
            return true;
        } else if (LOC.FORW == null && LOC.BACK == null) { // Only one node
            START = null;
            LAST = null;
            return true;
        } else { // Normal node
            LOC.BACK.FORW = LOC.FORW;
            LOC.FORW.BACK = LOC.BACK;
            return true;
        }
    } else {
        return false;
    }
}

    public DNode SEARCH(int ITEM) {
        //Algorrithm 5.2 SEARCH        
        DNode LOC = null;
        DNode PTR = null;
        PTR = START;
        while (PTR != null) {
            if (ITEM == ((Employee)PTR.INFOR).getId()) {
                LOC = PTR;
                return LOC;
            } else {
                PTR = PTR.FORW;
            }
        }
        //Show Result;
        if (LOC == null) {
            System.out.println("Not found.");
        } else {
            System.out.println("Found.");
        }
        return LOC;
    }
    
    public boolean containsId(int id) {
    DNode result[] = FINDB(id);
    DNode LOCA = result[0];
    return LOCA != null && ((Employee) LOCA.INFOR).getId() == id;
}

    public DNode[] FINDB(int ITEM) {
        DNode Location[] = new DNode[2];
        DNode PTR = null;
        DNode SAVE = null;
        DNode LOC = null;
        DNode LOCP = null;
        PTR = START;
        if (START == null) {
            LOC = null;
            LOCP = null;
            Location[0] = LOC;
            Location[1] = LOCP;
            return Location;
        }
        if (((Employee)START.INFOR).getId() == ITEM) {
            LOC = START;
            LOCP = null;
            Location[0] = LOC;
            Location[1] = LOCP;
            return Location;
        }
        SAVE = START;
        PTR = START.FORW;
        while (PTR != null) {
            if (((Employee)PTR.INFOR).getId() == ITEM) {
                LOC = PTR;
                LOCP = SAVE;
                Location[0] = LOC;
                Location[1] = LOCP;
                return Location;
            }
            SAVE = PTR;
            PTR = PTR.FORW;
        }
        LOC = null;
        //Show Result;
        if (LOC == null) {
            System.out.println("Not found.");
            Location[0] = LOC;
            Location[1] = LOCP;
            return Location;

        } else {
            System.out.println("Found.");
            Location[0] = LOC;
            Location[1] = LOCP;
            return Location;

        }
    }
}
