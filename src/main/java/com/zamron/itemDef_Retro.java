package com.zamron;

public class itemDef_Retro {


//Case = ITEM ID

    public static void newIDS(ItemDef itemDef, int id) {
        switch (id) {
//            case 1:
//                itemDef.modelID = 100002; //Floor model (technically)....
//                itemDef.maleEquip1 = 100002;
//                itemDef.femaleEquip1 = 100002;
//                itemDef.name = "Diamond Hatchet";
//                itemDef.actions = new String[] {null, "Wear", null, null, null};
//                itemDef.modelZoom = 1000; //Model zoom for inventory
//                itemDef.rotationY = 459; //rotates the model id in the inventory (Y)
//                itemDef.rotationX = 3; //Rotates the model id in the inventory (X)
//                itemDef.stackable = false; //Boolean - want the item to be stackable ?
//                itemDef.description = ""; //Sets the item description (Note this will be overwritten source sided)
//                itemDef.groundName = ""; //give it a different ground name when dropped on the floor.
//                break;
//            case 3:
//                itemDef.modelID = 83013; //Floor model (technically)....
//                itemDef.maleEquip1 = 83013;
//                itemDef.femaleEquip1 = 83013;
//                itemDef.name = "Gundam Wings";
//                itemDef.actions = new String[] {null, "Wear", null, null, null};
//                itemDef.modelZoom = 1000; //Model zoom for inventory
//                itemDef.rotationY = 459; //rotates the model id in the inventory (Y)
//                itemDef.rotationX = 3; //Rotates the model id in the inventory (X)
//                itemDef.stackable = false; //Boolean - want the item to be stackable ?
//                itemDef.description = ""; //Sets the item description (Note this will be overwritten source sided)
//                itemDef.groundName = ""; //give it a different ground name when dropped on the floor.
//                break;

            case 5:
                itemDef.modelID = 42505;
                itemDef.maleEquip1 = 42504;
                itemDef.femaleEquip1 = 42504;
                itemDef.name = "Winters Reap";
                itemDef.actions = new String[] {null, "Wear", null, null, null};
                itemDef.modelZoom = 1000; //Model zoom for inventory
                itemDef.rotationY = 459; //rotates the model id in the inventory (Y)
                itemDef.rotationX = 3; //Rotates the model id in the inventory (X)
                break;

            case 22205:
                    itemDef.modelID = 42501;
                    itemDef.maleEquip1 = 42501;
                    itemDef.femaleEquip1 = 42501;
                    itemDef.name = "Soul Biter MH";
                itemDef.actions = new String[] {null, "Wear", null, null, null};
                //itemDef.modelZoom = 1000; //Model zoom for inventory
                break;

            case 22206:
                itemDef.modelID = 42500;
                itemDef.maleEquip1 = 42500;
                itemDef.femaleEquip1 = 42500;
                itemDef.name = "Soul Biter OH";
                itemDef.actions = new String[] {null, "Wear", null, null, null};
                //itemDef.modelZoom = 1000; //Model zoom for inventory
                break;

            case 22207:
                itemDef.modelID = 42503;
                itemDef.maleEquip1 = 42502;
                itemDef.femaleEquip1 = 42502;
                itemDef.name = "Zamorakian Scythe";
                itemDef.actions = new String[] {null, "Wear", null, null, null};
                //itemDef.modelZoom = 1000; //Model zoom for inventory
                break;
        }
    }
}


