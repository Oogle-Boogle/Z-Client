package com.zamron;

public class ItemDef_Suic {

	public static void changeTexture(int id, int currentID, int targetID) {
		ItemDef itemDef = ItemDef.forID(id);
		itemDef.originalModelColors = new int[] { currentID };
		itemDef.newModelColor = new int[] { targetID };
	}

	public static ItemDef recolorItem(ItemDef itemDef, int id, int[] originalColor, int[] newColor) {
		ItemDef target = ItemDef.forID(id);
		itemDef.modelID = target.modelID;
		itemDef.maleEquip1 = target.maleEquip1;
		itemDef.femaleEquip1 = target.femaleEquip1;
		itemDef.modelZoom = target.modelZoom;
		itemDef.rotationX = target.rotationX;
		itemDef.rotationY = target.rotationY;
		itemDef.modelOffset1 = target.modelOffset1;
		itemDef.modelOffsetX = target.modelOffsetX;
		itemDef.modelOffsetY = target.modelOffsetY;
		itemDef.actions = target.actions;
		itemDef.maleEquip2 = target.maleEquip2;
		itemDef.maleEquip3 = target.maleEquip3;
		itemDef.femaleEquip2 = target.femaleEquip2;
		itemDef.femaleEquip3 = target.femaleEquip3;
		itemDef.maleXOffset = target.maleXOffset;
		itemDef.maleYOffset = target.maleYOffset;
		itemDef.femaleYOffset = target.femaleYOffset;
		itemDef.maleDialogue = target.maleDialogue;
		itemDef.maleDialogueModel = target.maleDialogueModel;
		itemDef.femaleDialogueModel = target.femaleDialogueModel;
		itemDef.originalModelColors = originalColor;
		itemDef.newModelColor = newColor;
		return itemDef;
	}

	public static ItemDef newIDS(ItemDef itemDef, int id) {

		switch (id) {
			case 12852:
				itemDef.name = "AFK Token";
				break;
		case 6950:
			itemDef.name = "Raids Orb";
			itemDef.actions = new String[] {"Check Invites", null, null, "Create Party", null};
			break;
		case 14559:
			itemDef.name = "Rex Whip";
			break;
		
		case 22194:
			ItemDef.copyModel(itemDef, 19152);
			itemDef.name = "Custom Ammo 1";
			break;
		case 22195:
			ItemDef.copyModel(itemDef, 19152);
			itemDef.name = "Custom Ammo 2";
			break;
		case 12845:
			itemDef.name = "Blue Infusion Stone";
			itemDef.stackable = true;
			break;
		case 12846:
			itemDef.name = "Red Infusion Stone";
			itemDef.stackable = true;
			break;
		case 12847:
			itemDef.name = "Black Infusion Stone";
			itemDef.stackable = true;
			break;
		case 12848:
			itemDef.name = "3HR Double Drop Stone";
			itemDef.actions = new String[] {"Smash", null, null, null, null};
			break;
			case 6639:
				itemDef.name = "Summon Mini-Me";
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Summon";
				break;
		case 20260:
			ItemDef.copyModel(itemDef, 15243);
			itemDef.name = "BFG Shots";
			break;
		case 3985:
			itemDef.name = "Zamron Cape";
			break;
		case 20700:
			itemDef.name = "Pro Defender";
			itemDef.modelID = 98650;
			itemDef.maleEquip1 = 98651;
			itemDef.femaleEquip1 = 98651;
			itemDef.actions = new String[] {null, "Equip", "Upgrade", null, null};
			break;
			
		case 5206:
			ItemDef.copyModel(itemDef, 4278);
			itemDef.name = "Defenders minigame teleport";
			itemDef.actions = new String[] {"Teleport to boss", null, null, null, null};
			break;
			
		case 6041:
			itemDef.name = "DR Amulet(0.5%)";
			break;
		case 19776:
			itemDef.name = "2% DR Swanky Boots";
			break;
		case 11732:
			itemDef.name = "Hellfire Boots";
			itemDef.originalModelColors = new int[] { 40 };
			itemDef.newModelColor = new int[] { 59 };
			break;
		
		case 20693:
			ItemDef.copyModel(itemDef, 13262);
			itemDef.name = "Tier 1 Defender";
			break;
			
		case 20694:
			ItemDef.copyModel(itemDef, 13262);
			itemDef.name = "Tier 2 Defender";
			break;
		case 3931:
			itemDef.name = "Rex Cape";
			break;
			
		case 20695:
			ItemDef.copyModel(itemDef, 13262);
			itemDef.name = "Tier 3 Defender";
			break;

			case 13591:
				itemDef.name = "KH Raids Key";
				break;
			
		case 20696:
			ItemDef.copyModel(itemDef, 13262);
			itemDef.name = "Tier 4 Defender";
			break;

		case 20697:
			ItemDef.copyModel(itemDef, 13262);
			itemDef.name = "Tier 5 Defender";
			break;
			
		case 20698:
			ItemDef.copyModel(itemDef, 13262);
			itemDef.name = "Tier 6 Defender";
			break;
			
		case 20699:
			ItemDef.copyModel(itemDef, 13262);
			itemDef.name = "Tier 7 Defender";
			break;
		case 19951:
            itemDef.name = "Stage 1 key";
            itemDef.modelID = 99036;
            itemDef.modelZoom = 5000;
            itemDef.modelOffset1 = 0;
            itemDef.modelOffsetY = 0;
            itemDef.rotationX = 19;
            itemDef.rotationY = 513;
            break;
        case 19952:
            itemDef.name = "Stage 2 key";
            itemDef.modelID = 99037;
            itemDef.modelZoom = 5000;
            itemDef.modelOffset1 = 0;
            itemDef.modelOffsetY = 0;
            itemDef.rotationX = 19;
            itemDef.rotationY = 513;
            break;
        case 19953:
            itemDef.name = "Stage 3 key";
            itemDef.modelID = 99038;
            itemDef.modelZoom = 5000;
            itemDef.modelOffset1 = 0;
            itemDef.modelOffsetY = 0;
            itemDef.rotationX = 19;
            itemDef.rotationY = 513;
            break;
        case 19954:
            itemDef.name = "Stage 4 key";
            itemDef.modelID = 99039;
            itemDef.modelZoom = 5000;
            itemDef.modelOffset1 = 0;
            itemDef.modelOffsetY = 0;
            itemDef.rotationX = 19;
            itemDef.rotationY = 513;
            break;
        case 19955:
            itemDef.name = "Stage 5 key";
            itemDef.modelID = 99040;
            itemDef.modelZoom = 5000;
            itemDef.modelOffset1 = 0;
            itemDef.modelOffsetY = 0;
            itemDef.rotationX = 19;
            itemDef.rotationY = 513;
            break;
        case 19956:
            itemDef.name = "Stage 6 key";
            itemDef.modelID = 99041;
            itemDef.modelZoom = 5000;
            itemDef.modelOffset1 = 0;
            itemDef.modelOffsetY = 0;
            itemDef.rotationX = 19;
            itemDef.rotationY = 513;
            break;
        case 19961:
            itemDef.name = "Stage 7 key";
            itemDef.modelID = 99042;
            itemDef.modelZoom = 5000;
            itemDef.modelOffset1 = 0;
            itemDef.modelOffsetY = 0;
            itemDef.rotationX = 19;
            itemDef.rotationY = 513;
            break;
        case 19958:
            itemDef.name = "Among Us Boss key";
            itemDef.modelID = 99043;
            itemDef.modelZoom = 5000;
            itemDef.modelOffset1 = 0;
            itemDef.modelOffsetY = 0;
            itemDef.rotationX = 19;
            itemDef.rotationY = 513;
            break;
		
		case 18955:
			itemDef.name = "Hurricane Boots";
			break;
			
		case 4001:
			itemDef.name = "Hurricane Helmet";
			break;
			
		case 3999:
			itemDef.name = "Hurricane Platebody";
			break;
			
		case 4000:
			itemDef.name = "Hurricane Platelegs";
			break;
			
		case 18956:
			itemDef.name = "Hurricane Gloves";
			break;
			
		case 18957:
			itemDef.name = "Hurricane Whip";
			break;
			
			
            
        case 13094:
            itemDef.modelID = 40226;
            itemDef.stackable = false;
            itemDef.name = "H'ween Scythe";
            itemDef.description = "Trick or Treat";
            itemDef.maleEquip1 = 40226;
            itemDef.femaleEquip1 = 40226;
            itemDef.modelZoom = 1957;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
            break;
            
        case 13095:
            itemDef.modelID = 40225;
            itemDef.stackable = false;
            itemDef.name = "H'ween Aura";
            itemDef.description = "Trick or Treat";
            itemDef.maleEquip1 = 40225;
            itemDef.femaleEquip1 = 40225;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
            break;
			
			
		case 18980:
			itemDef.modelZoom = 1000; // the zoom u chose in editor
			itemDef.rotationX = 175; // the rotation x u chose in editor
			itemDef.rotationY = 100; 
			itemDef.modelID = 99277;
			itemDef.maleEquip1 = 19993;
			itemDef.femaleEquip1 = 19993;
			break;
			
		case 18981:
			itemDef.modelZoom = 1577; // the zoom u chose in editor
			itemDef.rotationX = 1532; // the rotation x u chose in editor
			itemDef.rotationY = 522; 
			itemDef.modelID = 99276;
			itemDef.maleEquip1 = 19995;
			itemDef.femaleEquip1 = 19995;
		
			break;
			
		case 3307:
			itemDef.modelID = 23991;
			itemDef.maleEquip1 = 23991;
			itemDef.femaleEquip1 = 23991;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Yellow Super Saiyan Aura";
			break;
			
			
		case 5048:
			itemDef.modelID = 40159;
			itemDef.maleEquip1 = 40160;
			itemDef.femaleEquip1 = 40160;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Skiller Flex";
			break;
			
		case 5049:
			itemDef.modelID = 40162;
			itemDef.maleEquip1 = 40161;
			itemDef.femaleEquip1 = 40161;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Elegant black hat";
			break;
			
		case 5050:
			itemDef.modelID = 40164;
			itemDef.maleEquip1 = 40163;
			itemDef.femaleEquip1 = 40163;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Elegant black shirt";
			break;
			
		case 5051:
			itemDef.modelID = 40166;
			itemDef.maleEquip1 = 40165;
			itemDef.femaleEquip1 = 40165;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "elegant black trousers";
			break;
			
		case 4804:
			itemDef.modelID = 40151;
			itemDef.maleEquip1 = 40150;
			itemDef.femaleEquip1 = 40150;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Pirate Mask";
			break;
			
		case 4805:
			itemDef.modelID = 40153;
			itemDef.maleEquip1 = 40152;
			itemDef.femaleEquip1 = 40152;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Pirate Top";
			break;
			
		case 4806:
			itemDef.modelID = 40155;
			itemDef.maleEquip1 = 40154;
			itemDef.femaleEquip1 = 40154;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Pirate Leggings";
			break;
			
		case 4807:
			itemDef.modelID = 40157;
			itemDef.maleEquip1 = 40156;
			itemDef.femaleEquip1 = 40156;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Pirate Gloves";
			break;
			
		case 4808:
			itemDef.modelID = 40158;
			itemDef.maleEquip1 = 40158;
			itemDef.femaleEquip1 = 40158;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "M118i's Boots";
			break;
			
			
			
		case 3308:
			itemDef.modelID = 23992;
			itemDef.maleEquip1 = 23992;
			itemDef.femaleEquip1 = 23992;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Black Super Saiyan Aura";
			break;
			
		case 3309:
			itemDef.modelID = 23993;
			itemDef.maleEquip1 = 23993;
			itemDef.femaleEquip1 = 23993;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Red Super Saiyan Aura";
			break;
			
		case 6828:
            itemDef.actions = new String[5];
            itemDef.actions[2] = "Claim";
			itemDef.name = "Imbued Package";
			break;

		case 3311:
			itemDef.modelID = 23995;
			itemDef.maleEquip1 = 23996;
			itemDef.femaleEquip1 = 23996;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Skotizos Mace";
			break;
			
		case 3312:
			itemDef.modelID = 23997;
			itemDef.maleEquip1 = 23998;
			itemDef.femaleEquip1 = 23998;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Slayer Cape(2% DR)";
			break;
		case 3317:
			itemDef.name = "2% DR Increasing Ring";
			break;


			//new models
			case 17448:
				itemDef.modelID = 11127;
				itemDef.maleEquip1 = 11126;
				itemDef.femaleEquip1 = 11126;
				itemDef.actions = new String[] {null, "Wear", null, null, null};
				itemDef.name = "New helm";
				itemDef.stackable = false;
				break;

			case 17449:
				itemDef.modelID = 11129;
				itemDef.maleEquip1 = 11128;
				itemDef.femaleEquip1 = 11128;
				itemDef.actions = new String[] {null, "Wear", null, null, null};
				itemDef.name = "New Platebody";
				itemDef.stackable = false;
				break;

			case 17450:
				itemDef.modelID = 11131;
				itemDef.maleEquip1 = 11130;
				itemDef.femaleEquip1 = 11139;
				itemDef.actions = new String[] {null, "Wear", null, null, null};
				itemDef.name = "New legs";
				itemDef.stackable = false;
				break;

				//end of new models

		case 3313:
			itemDef.modelID = 24000;
			itemDef.maleEquip1 = 23999;
			itemDef.femaleEquip1 = 23999;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Sulphur Platebody";
			break;
			
		case 3314:
			itemDef.modelID = 24002;
			itemDef.maleEquip1 = 24001;
			itemDef.femaleEquip1 = 24001;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Sulphur Platelegs";
			break;
			
		
		case 3315:
			itemDef.modelID = 24004;
			itemDef.maleEquip1 = 24003;
			itemDef.femaleEquip1 = 24003;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Sulphur Boots";
			break;
			
			
		case 3318:
			itemDef.modelID = 24006;
			itemDef.maleEquip1 = 24005;
			itemDef.femaleEquip1 = 24005;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Sulphur Gloves";
			break;
			
			
			
		case 3638:
			itemDef.name = "Advanced box pet";
            itemDef.modelID = 23121;
            itemDef.modelZoom = 2750;
            itemDef.rotationY = 340;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
		case 3639:
			itemDef.name = "Extreme box pet";
            itemDef.modelID = 23121;
            itemDef.modelZoom = 2750;
            itemDef.rotationY = 340;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
		case 605:
			ItemDef.copyModel(itemDef, 4078);
			itemDef.name = "Halloween Event Key(1)";
			break;
			
		case 1590:
			itemDef.name = "Halloween Event Key(2)";
			break;
			
		case 993:
			itemDef.name = "Halloween Event Key(3)";
			break;

			case 9952:
			itemDef.name = "Charming Imp";
				itemDef.actions = new String[] { null, null, "Configure", null, "Drop" };
				break;
			
		case 3640:
			itemDef.name = "Supreme box pet";
            itemDef.modelID = 23121;
            itemDef.modelZoom = 2750;
            itemDef.rotationY = 340;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
		case 5042:
			itemDef.name = "Conqueror Helmet";
			itemDef.modelID = 40190;
			itemDef.maleEquip1 = 40191;
			itemDef.femaleEquip1 = 40191;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
			
		case 5043:
			itemDef.name = "Conqueror Chestplate";
			itemDef.modelID = 40192;
			itemDef.maleEquip1 = 40193;
			itemDef.femaleEquip1 = 40193;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 5044:
			itemDef.name = "Conqueror Platelegs";
			itemDef.modelID = 40194;
			itemDef.maleEquip1 = 40195;
			itemDef.femaleEquip1 = 40195;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 5045:
			itemDef.name = "Conqueror Gloves";
			itemDef.modelID = 40196;
			itemDef.maleEquip1 = 40197;
			itemDef.femaleEquip1 = 40197;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 5046:
			itemDef.name = "Conqueror Boots";
			itemDef.modelID = 40198;
			itemDef.maleEquip1 = 40198;
			itemDef.femaleEquip1 = 40198;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
        case 3810:
            itemDef.modelID = 24009;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.maleEquip1 = 24015;
            itemDef.femaleEquip1 = 24015;
            itemDef.name = "Omega Helmet";
            break;
            
        case 3811:
            itemDef.modelID = 24010;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.maleEquip1 = 24016;
            itemDef.femaleEquip1 = 24016;
            itemDef.name = "Omega Platebody";
            break;
            
        case 3812:
            itemDef.modelID = 24011;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.maleEquip1 = 24017;
            itemDef.femaleEquip1 = 24017;
            itemDef.name = "Omega Platelegs";
            break;
            
        case 3813:
            itemDef.modelID = 24012;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.maleEquip1 = 24018;
            itemDef.femaleEquip1 = 24018;
            itemDef.name = "Omega Gloves";
            break;
            
        case 3814:
            itemDef.modelID = 24013;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.maleEquip1 = 24019;
            itemDef.femaleEquip1 = 24019;
            itemDef.name = "Omega Boots";
            break;
            
        case 3815:
            itemDef.modelID = 24014;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.maleEquip1 = 24020;
            itemDef.femaleEquip1 = 24020;
            itemDef.name = "Omega Wings";
            break;
			
			case 15375:
			itemDef.name = "Chance Box";
			ItemDef.copyModel(itemDef, 3912);
			changeTexture(id, 63, 55);
			itemDef.actions = new String[5];
				itemDef.actions[0] = "Open";
				itemDef.actions[1] = null;
				itemDef.actions[2] = "Open all";
			break;

			case 9078:
				itemDef.name = "Aggressive Book";
				itemDef.actions = new String[] {null, null, null, null, null};
				break;
			
			
		case 3322:
			itemDef.modelID = 24008;
			itemDef.maleEquip1 = 24007;
			itemDef.femaleEquip1 = 24007;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Sulphur Helmet";
			break;
			
		case 3310:
			itemDef.modelID = 23994;
			itemDef.maleEquip1 = 23994;
			itemDef.femaleEquip1 = 23994;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Blue Super Saiyan Aura";
			break;
			
			

		case 18982:
			itemDef.modelZoom = 1461; // the zoom u chose in editor
			itemDef.rotationX = 1517; // the rotation x u chose in editor
			itemDef.rotationY = 476; 
			itemDef.modelID = 99275;
			itemDef.maleEquip1 = 19996;
			itemDef.femaleEquip1 = 19996;
		
			break;
			
		case 19002:
			itemDef.modelZoom = 1772; // the zoom u chose in editor
			itemDef.rotationX = 793; // the rotation x u chose in editor
			itemDef.rotationY = 416; 
			itemDef.modelID = 99274;
			itemDef.maleEquip1 = 5001;
			itemDef.femaleEquip1 = 5001;
			
			break;
		
		case 3300:
			itemDef.modelZoom = 1416; // the zoom u chose in editor
			itemDef.rotationX = 1559; // the rotation x u chose in editor
			itemDef.rotationY = 538; 
			itemDef.modelID = 95112;
			itemDef.maleEquip1 = 95111;
			itemDef.femaleEquip1 = 95111;
			itemDef.name = "Gecko Platebody";
			break;
			
		case 3301:
			itemDef.modelZoom = 1416; // the zoom u chose in editor
			itemDef.rotationX = 1559; // the rotation x u chose in editor
			itemDef.rotationY = 538; 
			itemDef.modelID = 95113;
			itemDef.maleEquip1 = 95114;
			itemDef.femaleEquip1 = 95114;
			itemDef.name = "Gecko Platelegs";
			break;
			
		case 3302:
			itemDef.modelZoom = 1416; // the zoom u chose in editor
			itemDef.rotationX = 1559; // the rotation x u chose in editor
			itemDef.rotationY = 538; 
			itemDef.modelID = 95116;
			itemDef.maleEquip1 = 95115;
			itemDef.femaleEquip1 = 95115;
			itemDef.name = "Gecko Helm";
			break;

			
		case 18933:
			itemDef.modelZoom = 1416; // the zoom u chose in editor
			itemDef.rotationX = 1559; // the rotation x u chose in editor
			itemDef.rotationY = 538; 
			itemDef.modelID = 99273;
			itemDef.maleEquip1 = 80004;
			itemDef.femaleEquip1 = 80004;
			
			break;
		
		case 3077:
			itemDef.name = "Dark Ranger's Bow";
			itemDef.modelZoom = 1611; // the zoom u chose in editor
			itemDef.rotationX = 549; // the rotation x u chose in editor
			itemDef.rotationY = 780;
			break;
		
		
		case 19893:
			itemDef.modelZoom = 1826; // the zoom u chose in editor
			itemDef.rotationX = 1954; // the rotation x u chose in editor
			itemDef.rotationY = 613;
			break;
		
		
		case 19025:
			itemDef.modelZoom = 1087; // the zoom u chose in editor
			itemDef.rotationX = 176; // the rotation x u chose in editor
			itemDef.rotationY = 230; 
		
			break;
		
		case 18895:
			itemDef.modelZoom = 700; // the zoom u chose in editor
			itemDef.rotationX = 100; // the rotation x u chose in editor
			itemDef.rotationY = 520;
			break;
		
		case 18934:
			itemDef.modelZoom = 1422; // the zoom u chose in editor
			itemDef.rotationX = 1592; // the rotation x u chose in editor
			itemDef.rotationY = 416; 
			itemDef.modelID = 99272;
			itemDef.maleEquip1 = 80007;
			itemDef.femaleEquip1 = 80007;
		
			break;
		
		case 18896:
			itemDef.modelZoom = 2242;
			itemDef.rotationX = 1769;
			itemDef.rotationY = 513;
			
			break;
		
		case 18946:
			itemDef.modelZoom = 1366;
			itemDef.rotationX = 740;
			itemDef.rotationY = 453;
			break;
		
		case 18943:
			itemDef.modelZoom = 1515;
			itemDef.rotationX = 2000;
			itemDef.rotationY = 472;
			
			break;
		
		case 18944:
			itemDef.modelZoom = 1632;
			itemDef.rotationX = 2000;
			itemDef.rotationY = 577;
			
			break;
		
		case 18945:
			itemDef.modelZoom = 971;
			itemDef.rotationX = 207;
			itemDef.rotationY = 230;
			
			break;
		
		case 19886:
			itemDef.modelZoom = 886;
			break;
		
		case 19106:
			itemDef.modelZoom = 886;
			break;

			case 10600:
				itemDef.name = "Scratch Card";
				itemDef.actions = new String[5];
				itemDef.actions[0] = "Scratch";
				break;
		
		
		case 3820:
            itemDef.name = "Lucid Full Helm";
			itemDef.modelZoom = 948;
			itemDef.rotationX = 145;
			itemDef.rotationY = 100;
			break;
		
		case 19027:
			itemDef.modelZoom = 1801;
			itemDef.rotationX = 679;
			itemDef.rotationY = 619;
			
			break;
		
		case 18967:
			itemDef.modelZoom = 944;
			itemDef.rotationX = 190;
			itemDef.rotationY = 100;
			
			break;
		
		case 19024:
			itemDef.modelZoom = 1437;
			itemDef.rotationX = 100;
			itemDef.rotationY = 472;
			
			break;
		
		case 16555:
			itemDef.modelZoom = 3512;
			itemDef.rotationX = 1463;
			itemDef.rotationY = 519;
			
			break;
		
		case 19004:
			itemDef.modelZoom = 1656;
			itemDef.rotationX = 2000;
			itemDef.rotationY = 1603;
			
			break;
		
		case 11605:
			itemDef.modelZoom = 1872;
			itemDef.rotationX = 345;
			itemDef.rotationY = 384;
			
			break;
		
		case 18901:
			itemDef.modelZoom = 1654;
			itemDef.rotationX = 1004;
			itemDef.rotationY = 472;
			
			break;
		
		case 18922:
			itemDef.modelZoom = 2944;
			itemDef.rotationX = 100;
			itemDef.rotationY = 100;
		
			break;
			
		case 18998:
			itemDef.modelZoom = 712;
			itemDef.rotationX = 1845;
			itemDef.rotationY = 121;
			
			break;
			
		case 18961:
			itemDef.modelZoom = 1900; // the zoom u chose in editor
			itemDef.rotationX = 1545; // the rotation x u chose in editor
			itemDef.rotationY = 657; 
			itemDef.modelID = 99271;
			itemDef.maleEquip1 = 11118;
			itemDef.femaleEquip1 = 11118;
		
			break;
		
		
		case 19060:
			itemDef.modelZoom = 1000; // the zoom u chose in editor
			itemDef.rotationX = 1532; // the rotation x u chose in editor
			itemDef.rotationY = 532; 
			itemDef.modelID = 99270;
			itemDef.maleEquip1 = 82948;
			itemDef.femaleEquip1 = 82948;
		
			break;
		
		case 18960:
			itemDef.modelZoom = 1888; // the zoom u chose in editor
			itemDef.rotationX = 1532; // the rotation x u chose in editor
			itemDef.rotationY = 532; 
			itemDef.modelID = 99269;
			itemDef.maleEquip1 = 11115;
			itemDef.femaleEquip1 = 11115;
			
			break;
			
		case 19061:
			itemDef.modelZoom = 2200; // the zoom u chose in editor
			itemDef.rotationX = 1532; // the rotation x u chose in editor
			itemDef.rotationY = 532; 
			itemDef.modelID = 99268;
			itemDef.maleEquip1 = 82949;
			itemDef.femaleEquip1 = 82949;
			
			break;
		
		
		case 19022:
			itemDef.modelZoom = 1034;
			itemDef.rotationX = 1805;
			itemDef.rotationY = 1603;
			break;
		
		case 4777:
			itemDef.modelZoom = 2686; // the zoom u chose in editor
			itemDef.rotationX = 1545; // the rotation x u chose in editor
			itemDef.rotationY = 657;
			itemDef.modelOffsetY = 0;
			itemDef.modelOffsetX = 0;
			itemDef.modelID = 99267;
			itemDef.maleEquip1 = 91274;
			itemDef.femaleEquip1 = 91274;
			break;
		
		case 19055:
			itemDef.modelZoom = 1909; // the zoom u chose in editor
			itemDef.rotationX = 746; // the rotation x u chose in editor
			itemDef.rotationY = 416; 
			itemDef.modelID = 99266;
			itemDef.maleEquip1 = 75500;
			itemDef.femaleEquip1 = 75500;
			
			break;
		
		case 18965:
			itemDef.modelZoom = 1521; // the zoom u chose in editor
			itemDef.rotationX = 370; // the rotation x u chose in editor
			itemDef.rotationY = 1879; 
			itemDef.modelID = 99265;
			itemDef.maleEquip1 = 12316;
			itemDef.femaleEquip1 = 12316;
			
			break;
		
		
		case 4761:
			itemDef.modelZoom = 886;
			itemDef.rotationX = 145;
			itemDef.rotationY = 100;
			itemDef.name = "Kings Full Helm";
			break;
		
		case 17914:
			itemDef.modelZoom = 854;
			itemDef.rotationX = 2000;
			itemDef.rotationY = 461;
			
			break;
		
		case 4765:
			itemDef.modelZoom = 1000;
			itemDef.rotationX = 235;
			itemDef.rotationY = 100;
			itemDef.name = "Kings boots";
			break;
		
		case 4764:
			itemDef.modelZoom = 827;
			itemDef.rotationX = 1864;
			itemDef.rotationY = 206;
			itemDef.name = "Kings gloves";
			break;

		case 3069:
			itemDef.modelZoom = 2000;
			itemDef.rotationX = 791;
			itemDef.rotationY = 720;
			
			break;

		case 3928:
			itemDef.modelZoom = 4083;
			itemDef.rotationX = 1442;
			itemDef.rotationY = 423;
			break;
		
		
		case 18865:
			itemDef.modelZoom = 1812;
			itemDef.rotationX = 1483;
			itemDef.rotationY = 438;
			itemDef.name = "Demonic Frost blade";
			break;
			
        case 2760:
            itemDef.modelID = 28388;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.modelZoom = 2000;
            itemDef.rotationX = 0;
            itemDef.modelOffsetY = -6;
            itemDef.modelOffsetX = 1;
            itemDef.maleEquip1 = 28389;
			changeTexture(id, 57, 73);
            itemDef.femaleEquip1 = 28389;
			itemDef.animateInventory = true;
            itemDef.name = "Exodens Blade";
            break;
		
		case 5079:
			itemDef.modelZoom = 1073;
			itemDef.rotationX = 276;
			itemDef.rotationY = 100;
			
			break;
		
		case 18985:
			itemDef.modelZoom = 2533; // the zoom u chose in editor
			itemDef.rotationX = 793; // the rotation x u chose in editor
			itemDef.rotationY = 296; 
			itemDef.modelID = 99263;
			itemDef.maleEquip1 = 22;
			itemDef.femaleEquip1 = 22;
			
			break;
		
		case 18950:
			itemDef.modelZoom = 1182; // the zoom u chose in editor
			itemDef.rotationX = 100; // the rotation x u chose in editor
			itemDef.rotationY = 100; 
			itemDef.modelID = 99262;
			itemDef.maleEquip1 = 10031;
			itemDef.femaleEquip1 = 10031;
			
			break;
		
		case 3911:
			itemDef.modelZoom = 2294;
			itemDef.rotationX = 1002;
			itemDef.rotationY = 442;
			
			break;
		
		case 19067:
			itemDef.modelZoom = 1299; // the zoom u chose in editor
			itemDef.rotationX = 749; // the rotation x u chose in editor
			itemDef.rotationY = 1422; 
			itemDef.modelID = 99261;
			itemDef.maleEquip1 = 8393;
			itemDef.femaleEquip1 = 8393;
			
			break;
		
		case 18989:
			itemDef.modelZoom = 2038; // the zoom u chose in editor
			itemDef.rotationX = 734; // the rotation x u chose in editor
			itemDef.rotationY = 246; 
			itemDef.modelID = 99260;
			itemDef.maleEquip1 = 2600;
			itemDef.femaleEquip1 = 2600;
			
			break;
			
		case 19009:
			itemDef.modelZoom = 1423;
			itemDef.rotationX = 1924;
			itemDef.rotationY = 1452;
			
			break;
		
		case 3951:
			itemDef.modelZoom = 2216;
			itemDef.rotationX = 100;
			itemDef.rotationY = 1849;
			
			break;
			
		case 5089:
			itemDef.modelZoom = 1890; // the zoom u chose in editor
			itemDef.rotationX = 478; // the rotation x u chose in editor
			itemDef.rotationY = 324; 
			itemDef.name = "Kings Sword";
			break;
		
		case 5133:
			itemDef.modelZoom = 2116; // the zoom u chose in editor
			itemDef.rotationX = 1760; // the rotation x u chose in editor
			itemDef.rotationY = 533; 
			itemDef.modelID = 99259;
			itemDef.maleEquip1 = 95101;
			itemDef.femaleEquip1 = 95101;
			itemDef.name = "Purple knight's Minigun";
			break;
			
		case 5081:
			itemDef.modelZoom = 2000; // the zoom u chose in editor
			itemDef.rotationX = 533; // the rotation x u chose in editor
			itemDef.rotationY = 333; 
			
			break;
		
		case 3990:
			itemDef.modelZoom = 2000; // the zoom u chose in editor
			itemDef.rotationX = 533; // the rotation x u chose in editor
			itemDef.rotationY = 333; 
			
			break;

			
		case 5131:
			itemDef.modelZoom = 2116; // the zoom u chose in editor
			itemDef.rotationX = 1760; // the rotation x u chose in editor
			itemDef.rotationY = 533; 
			itemDef.modelID = 99258;
			itemDef.maleEquip1 = 95093;
			itemDef.femaleEquip1 = 95093;
			
			break;
			
		case 5130:
			itemDef.modelZoom = 2116; // the zoom u chose in editor
			itemDef.rotationX = 1760; // the rotation x u chose in editor
			itemDef.rotationY = 533; 
			itemDef.modelID = 99257;
			itemDef.maleEquip1 = 91644;
			itemDef.femaleEquip1 = 91644;
			
			break;
		
		case 5132:
            itemDef.name = "Zamron Minigun";
			itemDef.modelZoom = 2116; // the zoom u chose in editor
			itemDef.rotationX = 1760; // the rotation x u chose in editor
			itemDef.rotationY = 533; 
			itemDef.modelID = 99256;
			itemDef.maleEquip1 = 95100;
			itemDef.femaleEquip1 = 95100;
			
			break;
		case 5134:
			itemDef.modelZoom = 2116; // the zoom u chose in editor
			itemDef.rotationX = 1760; // the rotation x u chose in editor
			itemDef.rotationY = 533; 
			itemDef.modelID = 99255;
			itemDef.maleEquip1 = 95090;
			itemDef.femaleEquip1 = 95090;
			//itemDef.maleEquip1 = 95090;
		// it looks weird, because its not same inv model as the regular mg
			// so just do it on the editor, and use those  values
			break;
			//am
		case 896: // item id
			itemDef.modelZoom = 2000; // the zoom u chose in editor
			itemDef.rotationX = 780; // the rotation x u chose in editor
			itemDef.rotationY = 533; // the rotation y u chose in editor
			// ok edit 1 more item ,i wanna see if u know how to do it k
			break; // at every case end, just add break;
		
		case 17911: //vip helm
			itemDef.name = "Hellfire Helm";
			break;
			
		case 17908: //vip platebody
			itemDef.name = "Hellfire Platebody";
			break;
			
			
		case 14705: //enchanted dust
			itemDef.name = "Enchanted Dust";
			break;
			
		case 17909: //vip platelegs
			itemDef.name = "Hellfire Platelegs";
			break;
			
		case 911: //vip spirit shield
			itemDef.name = "Vip spirit shield";
			break;
			
		case 3986: //vip fire cape
			itemDef.name = "Vip Fire Cape";
			break;
			
		case 17151: //sparta gloves
			itemDef.name = "DarkBlue Gloves";
			break;
			
		case 15026: //primordial gloves
			itemDef.name = "Primordial gloves";
			break;
			
		case 15032: //primordial gloves elite
			itemDef.name = "Hulk's Gloves";
			break;
			
		case 5054:
			itemDef.modelID = 75030;
			itemDef.maleEquip1 = 75031;
			itemDef.actions = new String[] {"Wear", "Wear", "Wear", null, null};
			break;
			
		case 12629: //Beast Range Gloves
			itemDef.name = "Beast Range Gloves";
			break;
			
		case 18347: //ranger gloves
			itemDef.name = "Ranger gloves";
			break;
			
		case 19033: //glaiven gloves
			itemDef.name = "Glaiven gloves!";
			break;
			
		case 11292: //gold Range boxing gloves
			itemDef.name = "Gold Range boxing gloves";
			break;
		
		case 5209:
			itemDef.name = "Infartico cape";
			itemDef.modelID = 99205;
			itemDef.maleEquip1 = 99205;
			itemDef.femaleEquip1 = 99205;
			itemDef.originalModelColors = new int[] { 54 };
			itemDef.newModelColor = new int[] { 74 };
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			break;

			
            
         case 4794:
             itemDef.modelID = 44256;
             itemDef.actions = new String[5];
             itemDef.actions[1] = "Wield";
             itemDef.maleEquip1 = 44257;
             itemDef.femaleEquip1 = 44257;
 			itemDef.originalModelColors = new int[] { 40 };
 			itemDef.newModelColor = new int[] { 61 };
             itemDef.name = "Noxious Platebody";
             break;
             
             
         case 4795:
             itemDef.modelID = 44258;
             itemDef.actions = new String[5];
             itemDef.actions[1] = "Wield";
             itemDef.maleEquip1 = 44259;
             itemDef.femaleEquip1 = 44259;
 			itemDef.originalModelColors = new int[] { 40 };
 			itemDef.newModelColor = new int[] { 61 };
             itemDef.name = "Noxious PlateLegs";
             break;
             
             
         case 4796:
             itemDef.modelID = 44260;
             itemDef.actions = new String[5];
             itemDef.actions[1] = "Wield";
             itemDef.maleEquip1 = 44261;
             itemDef.femaleEquip1 = 44261;
 			itemDef.originalModelColors = new int[] { 40 };
 			itemDef.newModelColor = new int[] { 61 };
             itemDef.name = "Noxious Blade";
             break;
             
         case 4797:
             itemDef.modelID = 44254;
             itemDef.actions = new String[5];
             itemDef.actions[1] = "Wield";
             itemDef.maleEquip1 = 44255;
             itemDef.femaleEquip1 = 44255;
 			itemDef.originalModelColors = new int[] { 40 };
 			itemDef.newModelColor = new int[] { 61 };
             itemDef.name = "Noxious Facemask";
             break;

             
            
         case 6443:
             itemDef.modelID = 24023;
             itemDef.actions = new String[5];
             itemDef.actions[1] = "Wield";
             itemDef.maleEquip1 = 24023;
             itemDef.femaleEquip1 = 24023;
             itemDef.name = "Galvek Boots";
             break;
             
             
         case 6444:
             itemDef.modelID = 24024;
             itemDef.actions = new String[5];
             itemDef.actions[1] = "Wield";
             itemDef.maleEquip1 = 24025;
             itemDef.femaleEquip1 = 24025;
             itemDef.name = "Galvek Gloves";
             break;
             
             
         case 6445:
             itemDef.modelID = 24026;
             itemDef.actions = new String[5];
             itemDef.actions[1] = "Wield";
             itemDef.maleEquip1 = 24027;
             itemDef.femaleEquip1 = 24027;
             itemDef.name = "Galvek Helmet";
             break;
             
         case 6446:
             itemDef.modelID = 24028;
             itemDef.actions = new String[5];
             itemDef.actions[1] = "Wield";
             itemDef.maleEquip1 = 24029;
             itemDef.femaleEquip1 = 24029;
             itemDef.name = "Galvek Platelegs";
             break;
             
         case 6447:
             itemDef.modelID = 24030;
             itemDef.actions = new String[5];
             itemDef.actions[1] = "Wield";
             itemDef.maleEquip1 = 24031;
             itemDef.femaleEquip1 = 24031;
             itemDef.name = "Galvek platebody";
             break;
             
         case 6449:
             itemDef.modelID = 40010;
             itemDef.actions = new String[5];
             itemDef.actions[1] = "Wield";
             itemDef.maleEquip1 = 40011;
             itemDef.femaleEquip1 = 40011;
             itemDef.name = "SSGJ hair";
             break;
             
         case 6450:
             itemDef.modelID = 40013;
             itemDef.actions = new String[5];
             itemDef.actions[1] = "Wield";
             itemDef.maleEquip1 = 40012;
             itemDef.femaleEquip1 = 40012;
             itemDef.name = "Dreamy Platebody";
             break;
             
         case 6451:
             itemDef.modelID = 40015;
             itemDef.actions = new String[5];
             itemDef.actions[1] = "Wield";
             itemDef.maleEquip1 = 40014;
             itemDef.femaleEquip1 = 40014;
             itemDef.name = "Dreamy Platelegs";
             break;
             
         case 6452:
             itemDef.modelID = 40017;
             itemDef.actions = new String[5];
             itemDef.actions[1] = "Wield";
             itemDef.maleEquip1 = 40016;
             itemDef.femaleEquip1 = 40016;
             itemDef.name = "Dreamy Gloves";
             break;
             
         case 6480:
             itemDef.modelID = 40018;
             itemDef.actions = new String[5];
             itemDef.actions[1] = "Wield";
             itemDef.maleEquip1 = 40018;
             itemDef.femaleEquip1 = 40018;
             itemDef.name = "Dreamy Boots";
             break;
         case 6481:
             itemDef.modelID = 40020;
             itemDef.actions = new String[5];
             itemDef.actions[1] = "Wield";
             itemDef.maleEquip1 = 40019;
             itemDef.femaleEquip1 = 40019;
             itemDef.name = "Dreamy Wings";
             break;
             
         case 6482:
             itemDef.modelID = 40021;
             itemDef.actions = new String[5];
             itemDef.actions[1] = "Wield";
             itemDef.maleEquip1 = 40022;
             itemDef.femaleEquip1 = 40022;
             itemDef.name = "OP Investor Cape";
             break;
             
   		case 3949:
 			itemDef.name = "Slayer helmet(Cyan)";
 			itemDef.modelID = 44288;
 			itemDef.maleEquip1 = 44289;
 			itemDef.femaleEquip1 = 44289;
			changeTexture(id, 40, 51);
 			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
 			itemDef.stackable = false;
 			break;
   		case 3950:
 			itemDef.name = "Slayer helmet(Green)";
 			itemDef.modelID = 44290;
 			itemDef.maleEquip1 = 44291;
 			itemDef.femaleEquip1 = 44291;
			changeTexture(id, 40, 58);
 			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
 			itemDef.stackable = false;
 			break;
   		case 3952:
 			itemDef.name = "Slayer helmet(Blue)";
 			itemDef.modelID = 44292;
 			itemDef.maleEquip1 = 44293;
 			itemDef.femaleEquip1 = 44293;
			changeTexture(id, 40, 53);
 			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
 			itemDef.stackable = false;
 			break;
             
             
         case 6483:
             itemDef.modelID = 40024;
             itemDef.actions = new String[5];
             itemDef.actions[1] = "Wield";
             itemDef.maleEquip1 = 40023;
             itemDef.femaleEquip1 = 40023;
             itemDef.name = "Daffy Duck Staff";
             break;
             
             
  		case 13992:
 			itemDef.name = "Azazels Faceguard";
 			itemDef.modelID = 44275;
 			itemDef.maleEquip1 = 44276;
 			itemDef.femaleEquip1 = 44276;
 			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
 			itemDef.stackable = false;
 			break;

 		case 19741:
			itemDef.name = " Luminita Cape";
			itemDef.modelID = 44302;
			itemDef.maleEquip1 = 44303;
			itemDef.femaleEquip1 = 44303;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
 		case 19742:
			itemDef.name = " Luminita Full Helmet";
			itemDef.modelID = 44304;
			itemDef.maleEquip1 = 44305;
			itemDef.femaleEquip1 = 44305;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
 		case 19743:
			itemDef.name = "Luminita Platelegs";
			itemDef.modelID = 44306;
			itemDef.maleEquip1 = 44307;
			itemDef.femaleEquip1 = 44307;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
 		case 19744:
			itemDef.name = " Luminita Platebody";
			itemDef.modelID = 44308;
			itemDef.maleEquip1 = 44309;
			itemDef.femaleEquip1 = 44309;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;

			
		case 19155:
			itemDef.name = "Detrimental Cape";
			itemDef.modelID = 23143;
			itemDef.femaleEquip1 = 23142;
			itemDef.maleEquip1 = 23142;
			changeTexture(id, 70, 62);
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
			break;	
			
		case 13995:
			itemDef.name = "Azazels Staff";
			itemDef.modelID = 44279;
			itemDef.maleEquip1 = 44280;
			itemDef.femaleEquip1 = 44280;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
			
		case 14447:
			itemDef.name = "Azazels Gauntlents";
			break;
			
			
		case 14448:
			itemDef.name = "Azazels Boots";
			break;
			
		case 13993:
			itemDef.name = "Azazels Robe bottoms";
			itemDef.modelID = 44277;
			itemDef.maleEquip1 = 44278;
			itemDef.femaleEquip1 = 44278;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 13994:
			itemDef.name = "Azazels Robe top";
			itemDef.modelID = 44273;
			itemDef.maleEquip1 = 44274;
			itemDef.femaleEquip1 = 44274;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 13991:
			itemDef.name = "Azazels Cape";
			itemDef.modelID = 44266;
			itemDef.maleEquip1 = 44267;
			itemDef.femaleEquip1 = 44267;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
             
             
         case 4741:
             itemDef.modelID = 44201;
             itemDef.actions = new String[5];
             itemDef.actions[1] = "Wield";
             itemDef.maleEquip1 = 44202;
             itemDef.femaleEquip1 = 44202;
             itemDef.name = "Deziqns staff";
             break;
         
		case 6320:
			itemDef.name = "Blade of Mercy";
			itemDef.modelZoom = 2116; // the zoom u chose in editor
			itemDef.rotationX = 1760; // the rotation x u chose in editor
			itemDef.rotationY = 533;
			itemDef.modelID = 24022;
			itemDef.maleEquip1 = 24022;
			itemDef.femaleEquip1 = 24022;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			break;

		case 3960:
		case 3908:
			itemDef.modelZoom = 877;
			itemDef.rotationX = 100;
			itemDef.rotationY = 100;
			break;

		case 4779:
			recolorItem(itemDef, 4777, new int[] { 36799 }, new int[] { 729 });
			itemDef.name = "Red Darklord Cape";
			break;
		case 15566:
			itemDef.modelID = 94073;
			itemDef.maleEquip1 = 94073;
			itemDef.femaleEquip1 = 94073;
			itemDef.originalModelColors = new int[] { 57 };
			itemDef.newModelColor = new int[] { 74 };
			itemDef.name = "Owner Cape";
			break;
			
		case 3267:
			itemDef.modelID = 23478;
			itemDef.maleEquip1 = 23478;
			itemDef.femaleEquip1 = 23478;
			itemDef.name = "Opulant Cape";
			itemDef.modelZoom = 877;
			itemDef.rotationX = 200;
			itemDef.rotationY = 200;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			break;
			
		case 18393:
			itemDef.modelID = 68825;
			itemDef.maleEquip1 = 68825;
			itemDef.femaleEquip1 = 68825;
			itemDef.name = "Ring of Torture";
            itemDef.actions[1] = "Wield";
            itemDef.modelZoom = 500;
			itemDef.rotationY = 100;
			break;
			
		case 18394:
			itemDef.modelID = 75084;
			itemDef.maleEquip1 = 75084;
			itemDef.femaleEquip1 = 75084;
			itemDef.name = "Leafy Wings";
            itemDef.actions[1] = "Wield";
            itemDef.modelZoom = 2000;
			break;
			
		case 18395:
			itemDef.modelID = 83234;
			itemDef.maleEquip1 = 83233;
			itemDef.femaleEquip1 = 83233;
            itemDef.actions[1] = "Wield";
            itemDef.modelZoom = 2000;
			itemDef.name = "Immortal Blade";
			break;
			
		case 2543:
			itemDef.modelID = 23480;
			itemDef.maleEquip1 = 23480;
			itemDef.femaleEquip1 = 23480;
            itemDef.actions[1] = "Wield";
			itemDef.name = "Tri-blade";
			itemDef.rotationY = 200;
	         itemDef.modelOffsetX = 0;
	         itemDef.modelOffsetY = 5;
			break;
			
		case 1667:
			itemDef.modelID = 23483;
			itemDef.maleEquip1 = 23482;
			itemDef.femaleEquip1 = 23482;
            itemDef.actions[1] = "Wield";
			itemDef.name = "Emerald Blade";
			break;
			
		case 1666:
			itemDef.modelID = 23485;
			itemDef.maleEquip1 = 23484;
			itemDef.femaleEquip1 = 23484;
            itemDef.actions[1] = "Wield";
			itemDef.name = "Lollipop";
			break;
			
			
		case 4781:
			recolorItem(itemDef, 3821, new int[] {63015, 64166, 682, 801}, new int[] {22054, 22054, 22054, 22054});
			itemDef.name = "Fate's Justiciar Body";
			break;
			
		case 4782:
			recolorItem(itemDef, 3822, new int[] {64172, 64020, 534, 64038}, new int[] {22054, 22054, 22054, 22054});
			itemDef.name = "Fate's Justiciar Legs";
			break;
			
		case 4783:
			recolorItem(itemDef, 3820, new int[] {64160, 64046, 64169}, new int[] {22054, 22054, 22054});
			itemDef.name = "Fate's Justiciar Helm";
			break;
			
		case 18387:
			recolorItem(itemDef, 3820, new int[] {64160, 64046, 64169}, new int[] {66034, 66034, 66034});
			itemDef.name = "Vapor Helm";
			break;
			
        case 899:
	         itemDef.modelID = 23180;
	         itemDef.name = "Saradomin Helmet";
	         itemDef.description = "Man this shet looks gud";
	         itemDef.maleEquip1 = 23181;
	         itemDef.femaleEquip1 = 23181;
	         itemDef.actions = new String[5];
	         itemDef.modelZoom = 1300;
	         itemDef.rotationY = 520;
	         itemDef.rotationX = 0;
	         itemDef.modelOffsetX = 0;
	         itemDef.modelOffsetY = 5;
	         itemDef.actions[1] = "Wear";
			 itemDef.actions[2] = "<col=C3C0B2>Dissolve Into Orbs Into Orbs";
	         itemDef.actions[4] = "Drop";
	         
	         break;
			
	         
        case 902:
	         itemDef.modelID = 23345;
	         itemDef.name = "Archers Helmet";
	         itemDef.description = "Man this shet looks gud";
	         itemDef.maleEquip1 = 23346;
	         itemDef.femaleEquip1 = 23346;
	         itemDef.actions = new String[5];
	         itemDef.modelZoom = 1300;
	         itemDef.rotationY = 520;
	         itemDef.rotationX = 0;
	         itemDef.modelOffsetX = 0;
	         itemDef.modelOffsetY = 5;
	         itemDef.actions[1] = "Wear";
			 
	         itemDef.actions[4] = "Drop";
	         
	         break;
	         
        case 903:
	         itemDef.modelID = 23347;
	         itemDef.name = "Archers Platebody";
	         itemDef.description = "Man this shet looks gud";
	         itemDef.maleEquip1 = 23348;
	         itemDef.femaleEquip1 = 23348;
	         itemDef.actions = new String[5];
	         itemDef.modelZoom = 1300;
	         itemDef.rotationY = 520;
	         itemDef.rotationX = 0;
	         itemDef.modelOffsetX = 0;
	         itemDef.modelOffsetY = 5;
	         itemDef.actions[1] = "Wear";
	         itemDef.actions[4] = "Drop";
	         break;
        case 919:
	         itemDef.modelID = 23362;
	         itemDef.name = "Virtual Gloves";
	         itemDef.description = "Man this shet looks gud";
	         itemDef.maleEquip1 = 23363;
	         itemDef.femaleEquip1 = 23363;
	         itemDef.actions = new String[5];
	         itemDef.modelZoom = 1300;
	         itemDef.rotationY = 520;
	         itemDef.rotationX = 0;
	         itemDef.modelOffsetX = 0;
	         itemDef.modelOffsetY = 5;
	         itemDef.actions[1] = "Wear";
	         itemDef.actions[4] = "Drop";
	         break;
        case 910:
	         itemDef.modelID = 23360;
	         itemDef.name = "Virtual Gloves";
	         itemDef.description = "Man this shet looks gud";
	         itemDef.maleEquip1 = 23361;
	         itemDef.femaleEquip1 = 23361;
	         itemDef.actions = new String[5];
	         itemDef.modelZoom = 1300;
	         itemDef.rotationY = 520;
	         itemDef.rotationX = 0;
	         itemDef.modelOffsetX = 0;
	         itemDef.modelOffsetY = 5;
	         itemDef.actions[1] = "Wear";
			 
	         itemDef.actions[4] = "Drop";
	         
	         break;
	         
        case 905:
	         itemDef.modelID = 23351;
	         itemDef.name = "Archers Wings";
	         itemDef.description = "Man this shet looks gud";
	         itemDef.maleEquip1 = 23352;
	         itemDef.femaleEquip1 = 23352;
	         itemDef.actions = new String[5];
	         itemDef.modelZoom = 1300;
	         itemDef.rotationY = 520;
	         itemDef.rotationX = 0;
	         itemDef.modelOffsetX = 0;
	         itemDef.modelOffsetY = 5;
	         itemDef.actions[1] = "Wear";
	         itemDef.actions[4] = "Drop";
	         break;
	         
        case 904:
	         itemDef.modelID = 23349;
	         itemDef.name = "Archers Platelegs";
	         itemDef.description = "Man this shet looks gud";
	         itemDef.maleEquip1 = 23350;
	         itemDef.femaleEquip1 = 23350;
	         itemDef.actions = new String[5];
	         itemDef.modelZoom = 1300;
	         itemDef.rotationY = 520;
	         itemDef.rotationX = 0;
	         itemDef.modelOffsetX = 0;
	         itemDef.modelOffsetY = 5;
	         itemDef.actions[1] = "Wear";
	         itemDef.actions[4] = "Drop";
	         break;
	         
	       case 900:
		         itemDef.modelID = 23182;
		         itemDef.name = "Saradomin Platebody";
		         itemDef.description = "Man this shet looks gud";
		         itemDef.maleEquip1 = 23183;
		         itemDef.femaleEquip1 = 23183;
		         itemDef.actions = new String[5];
		         itemDef.modelZoom = 1300;
		         itemDef.rotationY = 520;
		         itemDef.rotationX = 0;
		         itemDef.modelOffsetX = 0;
		         itemDef.modelOffsetY = 5;
		         itemDef.actions[1] = "Wear";
		         itemDef.actions[4] = "Drop";
		         break;
		         
		         
		       case 901:
			         itemDef.modelID = 23184;
			         itemDef.name = "Saradomin Platelegs";
			         itemDef.description = "Man this shet looks gud";
			         itemDef.maleEquip1 = 23185;
			         itemDef.femaleEquip1 = 22185;
			         itemDef.actions = new String[5];
			         itemDef.modelZoom = 1300;
			         itemDef.rotationY = 520;
			         itemDef.rotationX = 0;
			         itemDef.modelOffsetX = 0;
			         itemDef.modelOffsetY = 5;
			         itemDef.actions[1] = "Wear";
			         itemDef.actions[4] = "Drop";
			         break;
	         
		case 18390:
			recolorItem(itemDef, 3657, new int[] {70830, 70830, 70830}, new int[] {22114, 22114, 22114});
			itemDef.name = "WTF Boots";
			break;
			
		case 18388:
			recolorItem(itemDef, 3822, new int[] {64172, 64020, 534, 64038}, new int[] {66034, 66034, 66034, 66034});
			itemDef.name = "Vapor Legs";
			break;
			
		case 18389:
			recolorItem(itemDef, 3821, new int[] {64172, 64020, 534, 64038}, new int[] {66034, 66034, 66034, 66034});
			itemDef.name = "Vapor Body";
			break;
			
		case 4784:
			recolorItem(itemDef, 4777, new int[] {36799}, new int[] {22054});
			itemDef.name = "Fate's Darklord Cape";
			break;

		case 4780:
			recolorItem(itemDef, 19886, new int[] { 7254, 7278, 7258, 7250, 7233, 7454, 7248, 7218, 7243, 7223 },
					new int[] { 22054, 22054, 22054, 22054, 22054, 22054, 22054, 22054, 22054, 22054 });
			itemDef.name = "Fate's Collector Necklace";
			break;

		case 5174:
			ItemDef.copyModel(itemDef, 3757);
			itemDef.name = "Hellfire Blade";
			itemDef.animateInventory = true;
			break;

		case 5175:
			ItemDef.copyModel(itemDef, 13902);
			itemDef.name = "Zamron's Warhammer";
			itemDef.animateInventory = true;
			break;
			

		case 5176:
			ItemDef.copyModel(itemDef, 13887);
			itemDef.name = "Onyx Vesta Chainbody";
			itemDef.animateInventory = true;
			break;

		case 5177:
			ItemDef.copyModel(itemDef, 13893);
			itemDef.name = "Onyx Vesta Plateskirt";
			itemDef.animateInventory = true;
			break;

		case 5178:
			ItemDef.copyModel(itemDef, 3758);
			itemDef.name = "Hellfire Shield";
			itemDef.animateInventory = true;
			break;

		case 5180:
			ItemDef.copyModel(itemDef, 19706);
			itemDef.name = "Body of idk what";
			itemDef.animateInventory = true;
			break;

		case 5181:
			ItemDef.copyModel(itemDef, 19707);
			itemDef.name = "Legs of idk what";
			itemDef.animateInventory = true;
			break;

		case 5182:
			ItemDef.copyModel(itemDef, 19708);
			itemDef.name = "Helm of idk what";
			itemDef.animateInventory = true;
			break;

		case 5198:
			ItemDef.copyModel(itemDef, 3958);
			itemDef.name = "Virulent Platebody";
			changeTexture(id, 60, 72);
			break;

		case 5199:
			ItemDef.copyModel(itemDef, 3959);
			itemDef.name = "Virulent Platelegs";
			changeTexture(id, 60, 72);
			break;
			
		case 5203:
			ItemDef.copyModel(itemDef, 19055);
			itemDef.name = "A cool Sword";
			itemDef.modelID = 99500;
			itemDef.maleEquip1 = 99500;
			itemDef.femaleEquip1 = 99500;
			break;

		case 5200:
			ItemDef.copyModel(itemDef, 3960);
			itemDef.name = "Virulent Helm";
			changeTexture(id, 60, 72);
			break;

		case 5201:
			ItemDef.copyModel(itemDef, 3943);
			itemDef.name = "Bluefire VIP Necklace";
			changeTexture(id, 58, 62);
			break;

		/**
		 * case 19706: case 19707: case 19708:
		 */

		case 19119:
			ItemDef.copyModel(itemDef, 3941);
			itemDef.name = "Justin's Scythe";
			changeTexture(id, 40, 68);
			break;

		case 18683:
			ItemDef.copyModel(itemDef, 3941);
			itemDef.name = "Demonic Olm Scythe";
			changeTexture(id, 40, 70);
			break;
			
		case 18748:
			ItemDef.copyModel(itemDef, 3092);
			itemDef.name = "Demonic Olm Cape(2%Dr)";
			changeTexture(id, 40, 70);
			itemDef.animateInventory = true;
			break;
			
		case 10902:
			ItemDef.copyModel(itemDef, 3092);
			itemDef.name = "Dreamers Cape";
			changeTexture(id, 57, 62);
			itemDef.animateInventory = true;
			break;
			
		case 3988:
			ItemDef.copyModel(itemDef, 3912);
			itemDef.name = "Store Box";
			changeTexture(id, 63, 52);
			itemDef.animateInventory = true;
			break;

		case 3989:
			ItemDef.copyModel(itemDef, 3912);
			itemDef.name = "Random DR Item Box";
			changeTexture(id, 63, 73);
			itemDef.animateInventory = true;
			break;

		case 14019:
			itemDef.name = "Zamrons Max Cape";
			itemDef.animateInventory = true;
			break;

			
		case 15373:
			ItemDef.copyModel(itemDef, 3912);
			itemDef.name = "Starter Box";
			itemDef.actions = new String[5];
			itemDef.actions[0] = "Open";
			itemDef.actions[1] = null;
			itemDef.actions[2] = "Open all";
			changeTexture(id, 63, 58);
			itemDef.animateInventory = true;
			break;
			
		case 13997:
			ItemDef.copyModel(itemDef, 3912);
			itemDef.name = "Ovulant Box";
			itemDef.actions = new String[5];
			itemDef.actions[0] = "Open";
			itemDef.actions[1] = null;
			itemDef.actions[2] = "Open all";
			changeTexture(id, 63, 68);
			itemDef.animateInventory = true;
			itemDef.stackable = true;
			break;

			case 14934:
				itemDef.modelID = 40005;
				itemDef.name = "Harmonised Nightmare Staff";
				itemDef.description = "its a AOE weapon";
				itemDef.modelZoom = 1000;
				itemDef.rotationY = 500;
				itemDef.rotationX = 0;
				itemDef.modelOffset1 = -1;
				itemDef.modelOffsetY = -1;
				itemDef.maleEquip1 = 40006;
				itemDef.femaleEquip1 = 40006;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				break;

			case 19156:
			itemDef.modelID = 40000;
			itemDef.name = "Recolored Sharingan Aura";
			itemDef.description = "Sharingan Aura";
			itemDef.modelZoom = 1600;
			itemDef.rotationY = 500;
			itemDef.rotationX = 0;
			itemDef.modelOffset1 = -1;
			itemDef.modelOffsetY = -1;
			itemDef.maleEquip1 = 40000;
			itemDef.femaleEquip1 = 40000;
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wear";
			itemDef.actions[4] = "Drop";
			break;
			
			
			
        case 10905:
            itemDef.modelID = 44281;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.maleEquip1 = 44282;
            itemDef.femaleEquip1 = 44282;
            itemDef.name = "Detrimental Minigun";
            break;
			
		case 15654:
			ItemDef.copyModel(itemDef, 10689);
			itemDef.name = "Dzanth's boots";
			itemDef.animateInventory = true;
			break;
			
		case 15655:
			ItemDef.copyModel(itemDef, 18956);
			itemDef.name = "Dzanth's gloves";
			itemDef.animateInventory = true;
			break;
			
		case 6199:
			ItemDef.copyModel(itemDef, 3912);
			itemDef.name = "Advanced Box";
			changeTexture(id, 63, 66);
			itemDef.animateInventory = true;
			itemDef.actions = new String[5];
			itemDef.actions[0] = "Open";
			itemDef.actions[1] = null;
			itemDef.actions[2] = "Open all";
			break;
			
		case 15501:
			ItemDef.copyModel(itemDef, 14691);
			itemDef.name = "Donation Chest";
			itemDef.animateInventory = true;
			break;
        case 18405:
			ItemDef.copyModel(itemDef, 7462);
            itemDef.stackable = false;
            itemDef.name = "Onyx Gauntlets";
            itemDef.description = "Formed from a Onyx Gem";
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
            break;
		case 5173:
			ItemDef.copyModel(itemDef, 18865);
			itemDef.name = "Hellfire Shadow Sword";
			itemDef.animateInventory = true;
			itemDef.modelZoom = 1812;
			itemDef.rotationX = 1483;
			itemDef.rotationY = 438;
			
			break;

		case 5167:
			ItemDef.copyModel(itemDef, 20054);
			itemDef.name = "Dzanth's Lucky Ring";
			itemDef.animateInventory = true;
			break;
			
		case 9500:
			itemDef.name = "Inferior Helm";
			itemDef.modelID = 23853;
			itemDef.maleEquip1 = 23854;
			itemDef.femaleEquip1 = 23854;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 9501:
			itemDef.name = "Inferior Body";
			itemDef.modelID = 23857;
			itemDef.maleEquip1 = 23858;
			itemDef.femaleEquip1 = 23858;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 9502:
			itemDef.name = "Inferior legs";
			itemDef.modelID = 23859;
			itemDef.maleEquip1 = 23860;
			itemDef.femaleEquip1 = 23860;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
			
		case 6830:
			itemDef.name = "Supreme Package";
			itemDef.actions = new String[] { null, "Open", null, null, "Drop" };
			break;
        case 9503:
            itemDef.name = "Blessed Amulet(5%DR)";
			ItemDef.copyModel(itemDef, 15418);
            break;
            


		case 5169:
			ItemDef.copyModel(itemDef, 13899);
			itemDef.name = "Onyx Longsword";
			itemDef.animateInventory = true;
			break;

		case 5171:
			ItemDef.copyModel(itemDef, 18971);
			itemDef.name = "Purple Supreme Bow";
			itemDef.animateInventory = true;
			break;
			
		case 9505:
			itemDef.name = "Emperor Helm";
			itemDef.modelID = 23862;
			itemDef.maleEquip1 = 23863;
			itemDef.femaleEquip1 = 23863;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 9506:
			itemDef.name = "Emperor Body";
			itemDef.modelID = 23864;
			itemDef.maleEquip1 = 23865;
			itemDef.femaleEquip1 = 23865;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
			
		case 9507:
			itemDef.name = "Emperor Legs";
			itemDef.modelID = 23866;
			itemDef.maleEquip1 = 23867;
			itemDef.femaleEquip1 = 23867;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
			
		case 5186:
			ItemDef.copyModel(itemDef, 6619);
			itemDef.name = "Rex Boots";
			itemDef.animateInventory = true;
			break;

		case 5187:
			ItemDef.copyModel(itemDef, 20022);
			itemDef.name = "Rex Gloves";
			itemDef.animateInventory = true;
			break;

		case 5188:
			ItemDef.copyModel(itemDef, 6619);
			itemDef.name = "Onyx Boots";
			itemDef.animateInventory = true;
			break;

		case 5189:
			ItemDef.copyModel(itemDef, 20022);
			itemDef.name = "Onyx Range Gloves";
			itemDef.animateInventory = true;
			break;
			
		case 19468:
			ItemDef.copyModel(itemDef, 17293);
			itemDef.name = "Staff of Envy";
			itemDef.animateInventory = true;
			break;

		case 5172:
			ItemDef.copyModel(itemDef, 18931);
			itemDef.name = "Onyx Supreme Crossbow";
			itemDef.animateInventory = true;
			itemDef.modelZoom = 1966;
			itemDef.rotationX = 341;
			itemDef.rotationY = 446;
			break;
			
			
			
		case 19137:
			itemDef.name = "Royal Pernix hood";
			itemDef.modelID = 23163;
			itemDef.femaleEquip1 = 23164; //65343
			itemDef.maleEquip1 = 23164; //65343
			itemDef.editedModelColor = new int[] { 70 };//old
			itemDef.newModelColor = new int[] {63 };//new
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
			break;	
		case 19138:
			itemDef.name = "Royal Pernix platebody";
			itemDef.modelID = 23165;
			itemDef.femaleEquip1 = 23168;
			itemDef.maleEquip1 = 23168;
			itemDef.editedModelColor = new int[] { 70 };//old
			itemDef.newModelColor = new int[] {63 };//new
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
			break;	
		case 19139:
			itemDef.name = "Royal Pernix legs";
			itemDef.modelID = 23169;
			itemDef.femaleEquip1 = 23170;
			itemDef.maleEquip1 = 23170; //65349
			itemDef.editedModelColor = new int[] { 70 };//old
			itemDef.newModelColor = new int[] {63 };//new
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
			break;	
			
		case 3316:
			itemDef.name = "Rex Spirit Shield";
			break;

			case 19785:
				itemDef.name = "Elite void top";
				itemDef.modelZoom = 1221;
				itemDef.rotationY = 459;
				itemDef.modelOffsetY = 3;
				itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
				itemDef.modelID = 29170;
				itemDef.maleEquip1 = 29166;
				itemDef.maleEquip2 = 29165;
				itemDef.femaleEquip1 = 29169;
				itemDef.femaleEquip2 = 29168;
				break;

			case 19786:
				itemDef.name = "Elite void robe";
				itemDef.modelZoom = 2105;
				itemDef.rotationY = 525;
				itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
				itemDef.modelID = 29171;
				itemDef.maleEquip1 = 29164;
				itemDef.femaleEquip1 = 29167;
				break;
			
		case 15657:
			itemDef.modelID = 23316;
			itemDef.name = "Toxic helmet";
			itemDef.modelZoom = 2000;
			itemDef.rotationY = 0;
			itemDef.rotationX = 0;
			itemDef.modelOffsetX = 0;
			itemDef.modelOffsetY = 5;
			itemDef.femaleEquip1 = 23317;
			itemDef.maleEquip1 = 23317;
			itemDef.description = "Toxic helmet";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			itemDef.actions[4] = "Drop";
			break;
			
		case 15658:
			itemDef.modelID = 23318;
			itemDef.name = "Toxic Platebody";
			itemDef.modelZoom = 2000;
			itemDef.rotationY = 0;
			itemDef.rotationX = 0;
			itemDef.modelOffsetX = 0;
			itemDef.modelOffsetY = 5;
			itemDef.femaleEquip1 = 23319;
			itemDef.maleEquip1 = 23319;
			itemDef.description = "Toxic helmet";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			itemDef.actions[4] = "Drop";
			break;
			
			
			
		case 15659:
			itemDef.modelID = 23320;
			itemDef.name = "Toxic Platelegs";
			itemDef.modelZoom = 2000;
			itemDef.rotationY = 0;
			itemDef.rotationX = 0;
			itemDef.modelOffsetX = 0;
			itemDef.modelOffsetY = 5;
			itemDef.femaleEquip1 = 23321;
			itemDef.maleEquip1 = 23321;
			itemDef.description = "Toxic helmet";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			itemDef.actions[4] = "Drop";
			break;
			
			
        case 15660:
        	itemDef.modelID = 23332;
 			itemDef.name = "Chucky Doll";
 			itemDef.modelZoom = 1200;
	         itemDef.rotationY = 520;
	         itemDef.rotationX = 0;
	         itemDef.modelOffsetX = 0;
	         itemDef.modelOffsetY = 5;
 			itemDef.femaleEquip1 = 23332;
 			itemDef.maleEquip1 = 23332;
 			itemDef.description = "Chucky Doll";
 			itemDef.groundActions = new String[5];
            itemDef.groundActions[2] = "Take";
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
        	break;
        	
        	
        case 16429:
			
        	/*  318 */       itemDef.modelID = 23339;
        	/*  319 */       itemDef.maleEquip1 = 23340;
        					 itemDef.femaleEquip1 = 23340;
        	/*  320 */       itemDef.name = "Staff of Blood";
        	/*  321 */       itemDef.groundActions = new String[5];
        	/*  154 */       itemDef.groundActions[2] = "Take";
        	/*  155 */       itemDef.actions = new String[5];
        	/*  156 */       itemDef.actions[1] = "Wear";
			
        					itemDef.actions[4] = "Drop";
        				 	itemDef.rotationX = 0;
        				 /*  330 */       itemDef.rotationY = 0;
        				 /*  332 */       itemDef.modelOffsetX = 0;
        				 /*  333 */       itemDef.modelOffsetY = 0;
        	
        	break;
        	
        case 15661:
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
 		   
            itemDef.actions[4] = "Drop";
            itemDef.modelID = 23333;
            itemDef.name = "Crystal Boots";
            itemDef.modelZoom = 900;
            itemDef.rotationY = 165;
            itemDef.rotationX = 99;
            itemDef.modelOffsetX = 0;
            itemDef.modelOffsetY = 0;
            itemDef.maleEquip1 = 23333;
            itemDef.femaleEquip1 = 23333;
            itemDef.description = "Crystal Boots";
            break;
        case 15662:
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
 		   
            itemDef.actions[4] = "Drop";
            itemDef.modelID = 23334;
            itemDef.modelZoom = 900;
            itemDef.rotationY = 165;
            itemDef.rotationX = 99;
            itemDef.modelOffsetX = 0;
            itemDef.modelOffsetY = 90;
            itemDef.name = "Crystal Gloves";
            itemDef.maleEquip1 = 23334;
            itemDef.femaleEquip1 = 23334;
            itemDef.description = "Crystal Gloves";
            break;
        case 15663:
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
 		   
            itemDef.actions[4] = "Drop";
            itemDef.modelID = 23335;
            itemDef.modelZoom = 400;
            itemDef.rotationY = 165;
            itemDef.rotationX = 99;
            itemDef.modelOffsetX = 0;
            itemDef.modelOffsetY = 180;
            itemDef.name = "Crystal Helm";
            itemDef.maleEquip1 = 23335;
            itemDef.femaleEquip1 = 23335;
            itemDef.description = "Crystal Helm";
            break;
        case 15664:
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
 		   
            itemDef.actions[4] = "Drop";
            itemDef.modelID = 23336;
            itemDef.modelZoom = 1850;
            itemDef.rotationY = 275;
            itemDef.rotationX = 99;
            itemDef.modelOffsetX = 0;
            itemDef.modelOffsetY = -140;
            itemDef.name = "Crystal Body";
            itemDef.maleEquip1 = 23336;
            itemDef.femaleEquip1 = 23336;
            itemDef.description = "Crystal Body";
            break;
        case 15665:
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
 		   
            itemDef.actions[4] = "Drop";
            itemDef.modelID = 23337;
            itemDef.name = "Crystal Legs";
            itemDef.modelZoom = 900;
            itemDef.rotationY = 165;
            itemDef.rotationX = 99;
            itemDef.modelOffsetX = 0;
            itemDef.modelOffsetY = 0;
            itemDef.maleEquip1 = 23337;
            itemDef.femaleEquip1 = 23337;
            itemDef.description = "Crystal Legs";
            break;
        case 16428:
        	 itemDef.actions = new String[5];
             itemDef.actions[1] = "Wear";
             itemDef.actions[4] = "Drop";
			 itemDef.copyModel(itemDef, 3974);
             //itemDef.modelID = 23338;
             itemDef.modelZoom = 1000;
             itemDef.rotationY = 265;
             itemDef.rotationX = 99;
             itemDef.modelOffsetX = 0;
             itemDef.modelOffsetY = 0;
             itemDef.name = "Crystal Wings";
             itemDef.maleEquip1 = 23338;
             itemDef.femaleEquip1 = 23338;
             itemDef.description = "Crystal Wings";
			itemDef.originalModelColors = new int[] { 59 };
			itemDef.newModelColor = new int[] { 53};
             break;
			
		case 19131:
			itemDef.name = "Frost Demon helmet";
			itemDef.modelID = 23156;
			itemDef.femaleEquip1 = 23157; //65343
			itemDef.maleEquip1 = 23157; //65343
			itemDef.editedModelColor = new int[] { 70 };//old
			itemDef.newModelColor = new int[] {63 };//new
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
			break;	
			
		case 19132:
			itemDef.name = "Frost Demon platebody";
			itemDef.modelID = 23158;
			itemDef.femaleEquip1 = 23159;
			itemDef.maleEquip1 = 23159;
			itemDef.editedModelColor = new int[] { 70 };//old
			itemDef.newModelColor = new int[] {63 };//new
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
			break;	
		case 19133:
			itemDef.name = "Frost Demon platelegs";
			itemDef.modelID = 23160;
			itemDef.femaleEquip1 = 23161;
			itemDef.maleEquip1 = 23161; //65349
			itemDef.editedModelColor = new int[] { 70 };//old
			itemDef.newModelColor = new int[] {63 };//new
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
			break;	
		case 19134:
			itemDef.name = "Royal Reaper's gauntlets";
			itemDef.modelID = 23145;
			itemDef.femaleEquip1 = 23146;
			itemDef.maleEquip1 = 23146; //65350
			itemDef.editedModelColor = new int[] { 70 };//old
			itemDef.newModelColor = new int[] {63 };//new
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
			break;
			
   		case 3648:
			itemDef.name = "Mylos Helmet";
			itemDef.modelID = 40034;
			itemDef.maleEquip1 = 40033;
			itemDef.femaleEquip1 = 40033;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 3649:
			itemDef.name = "Mylos Platebody";
			itemDef.modelID = 40036;
			itemDef.maleEquip1 = 40035;
			itemDef.femaleEquip1 = 40035;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 3650:
			itemDef.name = "Mylos Platelegs";
			itemDef.modelID = 40038;
			itemDef.maleEquip1 = 40037;
			itemDef.femaleEquip1 = 40037;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 3651:
			itemDef.name = "Mylos War Axe";
			itemDef.modelID = 40040;
			itemDef.maleEquip1 = 40039;
			itemDef.femaleEquip1 = 40039;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 3652:
			itemDef.name = "Mylos gauntlents";
			itemDef.modelID = 40042;
			itemDef.maleEquip1 = 40041;
			itemDef.femaleEquip1 = 40041;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 3659:
			itemDef.name = "Mylos Boots";
			itemDef.modelID = 40043;
			itemDef.maleEquip1 = 40043;
			itemDef.femaleEquip1 = 40043;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
			
			
  		case 5112:
			itemDef.name = "Angelic Helmet";
			itemDef.modelID = 40170;
			itemDef.maleEquip1 = 40070;
			itemDef.femaleEquip1 = 40070;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 4691:
			ItemDef.copyModel(itemDef, 10874);
			itemDef.rotationY = 232;
			itemDef.name = "Colorful Tokens";
			break;
			
		case 5113:
			itemDef.name = "Angelic Legs";
			itemDef.modelID = 40071;
			itemDef.maleEquip1 = 40072;
			itemDef.femaleEquip1 = 40072;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 8654:
			itemDef.modelID = 40088;
			itemDef.maleEquip1 = 40089;
			itemDef.femaleEquip1 = 40089;
			itemDef.actions = new String[] {null, "Wear", "Operate", null, null};
			itemDef.name = "Imbued Sword";
			break;
			
		case 8655:
			itemDef.modelID = 40090;
			itemDef.maleEquip1 = 40091;
			itemDef.femaleEquip1 = 40091;
			itemDef.actions = new String[] {null, "Wear", "Operate", null, null};
			itemDef.name = "Imbued Bow";
			break;
			
		case 8656:
			itemDef.modelID = 40092;
			itemDef.maleEquip1 = 40093;
			itemDef.femaleEquip1 = 40093;
			itemDef.actions = new String[] {null, "Wear", "Operate", null, null};
			itemDef.name = "Imbued Staff";
			break;
			
		case 5114:
			itemDef.name = "Angelic Platebody";
			itemDef.modelID = 40073;
			itemDef.maleEquip1 = 40074;
			itemDef.femaleEquip1 = 40074;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 5115:
			itemDef.name = "Angelic Bow";
			itemDef.modelID = 40077;
			itemDef.maleEquip1 = 40076;
			itemDef.femaleEquip1 = 40076;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 4056:
			itemDef.modelID = 40107;
			itemDef.maleEquip1 = 40108;
			itemDef.femaleEquip1 = 40108;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Misery Helmet";
			break;
			
		case 4057:
			itemDef.modelID = 40109;
			itemDef.maleEquip1 = 40110;
			itemDef.femaleEquip1 = 40110;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Misery Platebody";
			break;
			
			
		case 4058:
			itemDef.modelID = 40111;
			itemDef.maleEquip1 = 40112;
			itemDef.femaleEquip1 = 40112;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Misery Platelegs";
			break;
			
			
		case 4059:
			itemDef.modelID = 40113;
			itemDef.maleEquip1 = 40114;
			itemDef.femaleEquip1 = 40114;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Blade of Misery";
			break;
			
			
		case 4060:
			itemDef.modelID = 40115;
			itemDef.maleEquip1 = 40116;
			itemDef.femaleEquip1 = 40116;
			itemDef.actions = new String[] {null, "Wear", "Operate", null, null};
			itemDef.name = "Imbued Platelegs(Melee)";
			break;
			
		case 4061:
			itemDef.modelID = 40117;
			itemDef.maleEquip1 = 40118;
			itemDef.femaleEquip1 = 40118;
			itemDef.actions = new String[] {null, "Wear", "Operate", null, null};
			itemDef.name = "Imbued Platebody(Melee)";
			break;
			
			
		case 4062:
			itemDef.modelID = 40119;
			itemDef.maleEquip1 = 40126;
			itemDef.femaleEquip1 = 40126;
			itemDef.actions = new String[] {null, "Wear", "Operate", null, null};
			itemDef.name = "Imbued Boots(Melee)";
			break;
			
			
		case 4063:
			itemDef.modelID = 40121;
			itemDef.maleEquip1 = 40122;
			itemDef.femaleEquip1 = 40122;
			itemDef.actions = new String[] {null, "Wear", "Operate", null, null};
			itemDef.name = "Imbued Platelegs(Range)";
			break;
			
		case 4064:
			itemDef.modelID = 40123;
			itemDef.maleEquip1 = 40124;
			itemDef.femaleEquip1 = 40124;
			itemDef.actions = new String[] {null, "Wear", "Operate", null, null};
			itemDef.name = "Imbued Platebody(Range)";
			break;
			
		case 4065:
			itemDef.modelID = 40125;
			itemDef.maleEquip1 = 40126;
			itemDef.femaleEquip1 = 40126;
			itemDef.actions = new String[] {null, "Wear", "Operate", null, null};
			itemDef.name = "Imbued Boots(Range)";
			break;
			
			
			
		case 4067:
			itemDef.modelID = 40127;
			itemDef.maleEquip1 = 40128;
			itemDef.femaleEquip1 = 40128;
			itemDef.actions = new String[] {null, "Wear", "Operate", null, null};
			itemDef.name = "Imbued Robe bottoms(Magic)";
			break;
			
		case 4085:
			itemDef.modelID = 40129;
			itemDef.maleEquip1 = 40130;
			itemDef.femaleEquip1 = 40130;
			itemDef.actions = new String[] {null, "Wear", "Operate", null, null};
			itemDef.name = "Imbued Robe top(Magic)";
			break;
			
		case 4555:
			itemDef.modelID = 40131;
			itemDef.maleEquip1 = 40132;
			itemDef.femaleEquip1 = 40132;
			itemDef.actions = new String[] {null, "Wear", "Operate", null, null};
			itemDef.name = "Imbued boots(Magic)";
			break;
			
			
			
		case 16545:
			itemDef.modelID = 40133;
			itemDef.maleEquip1 = 40134;
			itemDef.femaleEquip1 = 40134;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Dedi Wizard hat";
			break;
			
        case 18752:
            itemDef.actions = new String[5];
            itemDef.actions[2] = "Open";
            itemDef.modelID = 23375;
			itemDef.modelZoom = 1416; 
            itemDef.name = "Sephiroths Chest Key(2)";
            break;
            
        case 18753:
            itemDef.actions = new String[5];
            itemDef.actions[2] = "Open";
            itemDef.modelID = 23375;
			itemDef.modelZoom = 1416; 
            itemDef.name = "Sephiroths Chest Key(3)";
            break;
			
			
		case 16546:
			itemDef.modelID = 40135;
			itemDef.maleEquip1 = 40136;
			itemDef.femaleEquip1 = 40136;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Dedi Wizard Robetop";
			break;
			
			
		case 16548:
			itemDef.modelID = 40137;
			itemDef.maleEquip1 = 40138;
			itemDef.femaleEquip1 = 40138;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Dedi Wizard robelegs";
			break;
			
		case 16549:
			itemDef.modelID = 40139;
			itemDef.maleEquip1 = 40140;
			itemDef.femaleEquip1 = 40140;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Royal Slayer legs";
			break;
			
		case 16550:
			itemDef.modelID = 40141;
			itemDef.maleEquip1 = 40142;
			itemDef.femaleEquip1 = 40142;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Royal Slayer Sword";
			break;
			
		case 16551:
			itemDef.modelID = 40143;
			itemDef.maleEquip1 = 40144;
			itemDef.femaleEquip1 = 40144;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Royal Slayer Platebody";
			break;
			
		case 16553:
			itemDef.modelID = 40145;
			itemDef.maleEquip1 = 40145;
			itemDef.femaleEquip1 = 40145;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Royal Slayer Boots";
			break;
			
		case 16556:
			itemDef.modelID = 40146;
			itemDef.maleEquip1 = 40147;
			itemDef.femaleEquip1 = 40147;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Royal Slayer Gloves";
			break;
			
		case 16558:
			itemDef.modelID = 40148;
			itemDef.maleEquip1 = 40149;
			itemDef.femaleEquip1 = 40149;
			itemDef.actions = new String[] {null, "Wear", null, null, null};
			itemDef.name = "Royal Slayer Helmet";
			break;
			
			
  		case 5107:
			itemDef.name = "Youtubers Hood";
			itemDef.modelID = 40059;
			itemDef.maleEquip1 = 40060;
			itemDef.femaleEquip1 = 40060;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
  		case 3945:
			itemDef.name = "Resilience Boots";
			itemDef.modelID = 40102;
			itemDef.maleEquip1 = 40102;
			itemDef.femaleEquip1 = 40102;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
  		case 3946:
			itemDef.name = "Resilience Blade(MH)";
			itemDef.modelID = 40103;
			itemDef.maleEquip1 = 40104;
			itemDef.femaleEquip1 = 40104;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
  		case 3947:
			itemDef.name = "Resilience Blade(OH)";
			itemDef.modelID = 40103;
			itemDef.maleEquip1 = 40105;
			itemDef.femaleEquip1 = 40105;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
  		case 3948:
			itemDef.name = "Resilience Backblade";
			itemDef.modelID = 40106;
			itemDef.maleEquip1 = 40106;
			itemDef.femaleEquip1 = 40106;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
			
  		case 3944:
			itemDef.name = "Resilience Gloves";
			itemDef.modelID = 40100;
			itemDef.maleEquip1 = 40101;
			itemDef.femaleEquip1 = 40101;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
  		case 3939:
			itemDef.name = "Resilience Legs";
			itemDef.modelID = 40098;
			itemDef.maleEquip1 = 40099;
			itemDef.femaleEquip1 = 40099;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
  		case 3938:
			itemDef.name = "Resilience Body";
			itemDef.modelID = 40096;
			itemDef.maleEquip1 = 40097;
			itemDef.femaleEquip1 = 40097;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
  		case 3937:
			itemDef.name = "Resilience Hood";
			itemDef.modelID = 40094;
			itemDef.maleEquip1 = 40095;
			itemDef.femaleEquip1 = 40095;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 5108:
			itemDef.name = "Youtubers bell";
			itemDef.modelID = 40061;
			itemDef.maleEquip1 = 40062;
			itemDef.femaleEquip1 = 40062;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 5109:
			itemDef.name = "Youtubers Robe bottoms";
			itemDef.modelID = 40063;
			itemDef.maleEquip1 = 40064;
			itemDef.femaleEquip1 = 40064;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 5110:
			itemDef.name = "Youtubers Robe top";
			itemDef.modelID = 40065;
			itemDef.maleEquip1 = 40066;
			itemDef.femaleEquip1 = 40066;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 5111:
			itemDef.name = "Youtubers backsack";
			itemDef.modelID = 40067;
			itemDef.maleEquip1 = 40068;
			itemDef.femaleEquip1 = 40058;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;

		case 3915:
			itemDef.name = "Demi Wizard Hat";
			itemDef.modelID = 40046;
			itemDef.maleEquip1 = 40047;
			itemDef.femaleEquip1 = 40047;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 3916:
			itemDef.name = "Demi Robetop";
			itemDef.modelID = 40048;
			itemDef.maleEquip1 = 40049;
			itemDef.femaleEquip1 = 40049;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 3917:
			itemDef.name = "Demi Bottoms";
			itemDef.modelID = 40050;
			itemDef.maleEquip1 = 40051;
			itemDef.femaleEquip1 = 40051;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 3918:
			itemDef.name = "Fantasy Gloves";
			itemDef.modelID = 40052;
			itemDef.maleEquip1 = 40053;
			itemDef.femaleEquip1 = 40053;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 6659:
			itemDef.name = "Gluttony Helmet";
			itemDef.modelID = 40170;
			itemDef.maleEquip1 = 40171;
			itemDef.femaleEquip1 = 40171;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
		case 6783:
			itemDef.name = "Gluttony Platebody";
			itemDef.modelID = 40172;
			itemDef.maleEquip1 = 40173;
			itemDef.femaleEquip1 = 40173;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
		case 6784:
			itemDef.name = "Gluttony Platelegs";
			itemDef.modelID = 40174;
			itemDef.maleEquip1 = 40175;
			itemDef.femaleEquip1 = 40175;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
		case 6785:
			itemDef.name = "Gluttony Gloves";
			itemDef.modelID = 40176;
			itemDef.maleEquip1 = 40177;
			itemDef.femaleEquip1 = 40177;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
		case 6786:
			itemDef.name = "Gluttony Boots";
			itemDef.modelID = 40178;
			itemDef.maleEquip1 = 40178;
			itemDef.femaleEquip1 = 40178;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
			
		case 6927:
			itemDef.name = "Immoral Helmet";
			itemDef.modelID = 40179;
			itemDef.maleEquip1 = 40180;
			itemDef.femaleEquip1 = 40180;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
		case 6928:
			itemDef.name = "Immoral Platebody";
			itemDef.modelID = 40181;
			itemDef.maleEquip1 = 40182;
			itemDef.femaleEquip1 = 40182;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 6929:
			itemDef.name = "Immoral Platelegs";
			itemDef.modelID = 40183;
			itemDef.maleEquip1 = 40184;
			itemDef.femaleEquip1 = 40184;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
		case 6930:
			itemDef.name = "Immoral Longsword";
			itemDef.modelID = 40185;
			itemDef.maleEquip1 = 40186;
			itemDef.femaleEquip1 = 40186;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
		case 6931:
			itemDef.name = "Immoral Shield";
			itemDef.modelID = 40188;
			itemDef.maleEquip1 = 40189;
			itemDef.femaleEquip1 = 40189;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
			
		case 6657:
			itemDef.name = "Gluttony Hammer(MH)";
			itemDef.modelID = 40169;
			itemDef.maleEquip1 = 40167;
			itemDef.femaleEquip1 = 40167;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
		case 6658:
			itemDef.name = "Gluttony Hammer(OH)";
			itemDef.modelID = 40169;
			itemDef.maleEquip1 = 40168;
			itemDef.femaleEquip1 = 40168;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
			
		case 3919:
			itemDef.name = "Demi Boots";
			itemDef.modelID = 40054;
			itemDef.maleEquip1 = 40054;
			itemDef.femaleEquip1 = 40054;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 3920:
			itemDef.name = "Demi staff";
			itemDef.modelID = 40055;
			itemDef.maleEquip1 = 40056;
			itemDef.femaleEquip1 = 40056;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;

		case 19135:
			itemDef.name = "Royal Reaper's  boots";
			itemDef.modelID = 23144;
			itemDef.femaleEquip1 = 23144;
			itemDef.maleEquip1 = 23144;
			itemDef.editedModelColor = new int[] { 70 };//old
			itemDef.newModelColor = new int[] {63 };//new
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
			break;	
		case 19136:
			itemDef.name = "Royal Reaper's drape";
			itemDef.modelID = 23143;
			itemDef.femaleEquip1 = 23142;
			itemDef.maleEquip1 = 23142;
			itemDef.editedModelColor = new int[] { 70 };//old
			itemDef.newModelColor = new int[] {63 };//new
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
			break;
			
		case 3647:
			itemDef.name = "Pet Killer chucky";
            itemDef.modelID = 40032;
            itemDef.modelZoom = 2750;
            itemDef.rotationY = 340;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
		case 3642:
			itemDef.name = "Demonic Glaive";
            itemDef.modelID = 40030;
            itemDef.maleEquip1 = 40029;
            itemDef.femaleEquip1 = 40029;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.stackable = false;
            break;
			
		case 3641:
			itemDef.name = "Solace Glaive";
            itemDef.modelID = 23964;
            itemDef.maleEquip1 = 23965;
            itemDef.femaleEquip1 = 23965;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.stackable = false;
			itemDef.animateInventory = true;
			itemDef.originalModelColors = new int[] { 60, 62 };
			itemDef.newModelColor = new int[] { 56, 63};
            break;
			
		case 19123:
			itemDef.name = "Thermo Sword";
			ItemDef Reaper = ItemDef.forID(1305);
			itemDef.modelID = 23153;
			itemDef.femaleEquip1 = 23154; //65342
			itemDef.maleEquip1 = 23154;
			itemDef.modelOffset1 = Reaper.modelOffset1;
			itemDef.modelOffsetX = Reaper.modelOffsetX;
			itemDef.modelOffsetY = Reaper.modelOffsetY;
			itemDef.modelZoom = Reaper.modelZoom;
			itemDef.rotationX = Reaper.rotationX;
			itemDef.rotationY = Reaper.rotationY;
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
			itemDef.editedModelColor = new int[] { 70 };//old
			itemDef.newModelColor = new int[] {62 };//new
			break;	
			
		case 932:
			itemDef.name = "Bluefire UBER Sword";
			ItemDef Reaper1 = ItemDef.forID(1305);
			itemDef.modelID = 23153;
			itemDef.femaleEquip1 = 23154; //65342
			itemDef.maleEquip1 = 23154;
			itemDef.modelOffset1 = Reaper1.modelOffset1;
			itemDef.modelOffsetX = Reaper1.modelOffsetX;
			itemDef.modelOffsetY = Reaper1.modelOffsetY;
			itemDef.modelZoom = Reaper1.modelZoom;
			itemDef.rotationX = Reaper1.rotationX;
			itemDef.rotationY = Reaper1.rotationY;
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
			changeTexture(id, 70, 71);
			break;	
			
		case 17890:
			itemDef.modelID = 23443;
			itemDef.name = "Deluxe Stoner Pants";
			itemDef.femaleEquip1 = 23444;
			itemDef.maleEquip1 = 23444;
			itemDef.description = "check the pockets!";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			
			itemDef.actions[4] = "Drop";
			break;
			
		case 11142:
			itemDef.modelID = 40266;
			itemDef.name = "Phoenix DDoS Protector";
			itemDef.femaleEquip1 = 40267;
			itemDef.maleEquip1 = 40267;
			itemDef.description = "Hopefully he protects us against future Ddos attacks!";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			itemDef.actions[4] = "Drop";
			break;
			
		case 17891:
			itemDef.modelID = 23445;
			itemDef.name = "Deluxe Stoner Hat";
			itemDef.femaleEquip1 = 23446;
			itemDef.maleEquip1 = 23446;
			itemDef.description = "cool beanie!";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			
			itemDef.actions[4] = "Drop";
			break;
		case 17892:
			itemDef.modelID = 23447;
			itemDef.name = "Deluxe Stoner Shirt";
			itemDef.femaleEquip1 = 23448;
			itemDef.maleEquip1 = 23448;
			itemDef.description = "Kingdoms favorite shirt";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			
			itemDef.actions[4] = "Drop";
			break;
			
		case 8001:
			itemDef.name = "Apollo Crossbow";
			itemDef.modelID = 64495;
			itemDef.maleEquip1 = 64496;
			itemDef.femaleEquip1 = 64496;
			itemDef.modelZoom = 1700;
			itemDef.actions[1] = "Wield";
			itemDef.actions[4] = "Drop";
			itemDef.stackable = false;
		//	itemDef.actions[3] = "<col=C3C0B2>Dissolve Into Orbs into Orbs";
			//itemDef.rdc2 = 654332;
			break;
		
			
		case 17893:
			itemDef.modelID = 23449;
			itemDef.name = "Deluxe Stoner Gloves";
			itemDef.femaleEquip1 = 23450;
			itemDef.maleEquip1 = 23450;
			itemDef.description = "I should try rolling a blunt with these on";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			
			itemDef.actions[4] = "Drop";
			break;
		case 17894:
			itemDef.modelID = 23451;
			itemDef.name = "Deluxe Stoner Boots";
			itemDef.femaleEquip1 = 23452;
			itemDef.maleEquip1 = 23452;
			itemDef.description = "pair of stoner boots";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			
			itemDef.actions[4] = "Drop";
			break;
			
		case 6191:
			itemDef.modelID = 23441;
			itemDef.name = "Deluxe Stoner Bong";
			itemDef.femaleEquip1 = 23442;
			itemDef.maleEquip1 = 23442;
            itemDef.rotationY = 165;
            itemDef.rotationX = 169;
			itemDef.description = "its a stoner bong, save it in ur inventory";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[4] = "Drop";
			break;
			
		case 6192:
			itemDef.modelID = 23441;
			itemDef.name = "2% Drop Rate Bong";
			itemDef.femaleEquip1 = 23442;
			itemDef.maleEquip1 = 23442;
            itemDef.rotationY = 165;
            itemDef.rotationX = 169;
			itemDef.description = "its a stoner bong, save it in ur inventory";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[4] = "Drop";
			break;
			
			
        case 3275:
            itemDef.modelID = 23892;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.maleEquip1 = 23893;
            itemDef.femaleEquip1 = 23893;
            itemDef.name = "Ray gun";
            break;
			
			
        case 3276:
            itemDef.modelID = 23894;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.maleEquip1 = 23895;
            itemDef.femaleEquip1 = 23895;
            itemDef.name = "Saber";
            break;
            
       /** case 10835:
        	itemDef.modelID = 28679;
            itemDef.actions = new String[5];
			itemDef.actions = new String[] { "Add to Inv", null, "Add to pouch",null, null};
            itemDef.name = "1B Coin";
			itemDef.rotationX = 2; // the rotation x u chose in editor
			itemDef.rotationY = 400;
			itemDef.modelZoom = 1600;
			break;**/

			case 10835:
				itemDef.name = "1B Coins";
				itemDef.actions = new String[5];
				itemDef.actions = new String[] { "Add to Inv", null, "Add to pouch",null, null};
				break;
            
        case 3274:
            itemDef.modelID = 23896;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.maleEquip1 = 23897;
            itemDef.femaleEquip1 = 23897;
            itemDef.name = "dual-sided Saber";
            break;
			
		case 17903:
			itemDef.modelID = 23453;
			itemDef.name = "Weed leaf";
			itemDef.femaleEquip1 = 23454;
			itemDef.maleEquip1 = 23454;
			itemDef.description = "a lovely cape";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			itemDef.actions[4] = "Drop";
			break;
			
		case 9943:
			itemDef.name = "Oz of Jane";
			itemDef.description = "a lovely smell drifts in the air";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[4] = "Drop";
			break;
			
		case 17413:
			itemDef.name = "Bong Water";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[4] = "Drop";
			break;
			
        case 6193:
            itemDef.modelID = 23876;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.modelZoom = 2000;
            itemDef.rotationX = 0;
            itemDef.modelOffsetY = -6;
            itemDef.modelOffsetX = 1;
            itemDef.maleEquip1 = 23877;
            itemDef.femaleEquip1 = 23877;
            itemDef.name = "Zeus flagcape";
            break;
            
        case 6194:
            itemDef.modelID = 23878;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.maleEquip1 = 23879;
            itemDef.femaleEquip1 = 23879;
            itemDef.name = "Zeus full helm";
            break;
            
        case 6195:
            itemDef.modelID = 23880;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.maleEquip1 = 23881;
            itemDef.femaleEquip1 = 23881;
            itemDef.name = "Zeus Platebody";
            break;
        case 6196:
            itemDef.modelID = 23882;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.maleEquip1 = 23883;
            itemDef.femaleEquip1 = 23883;
            itemDef.name = "Zeus Platelegs";
            break;
        case 6197:
            itemDef.modelID = 23884;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.maleEquip1 = 23885;
            itemDef.femaleEquip1 = 23885;
            itemDef.name = "Zeus Hammer";
            break;
            
        case 6198:
            itemDef.modelID = 23887;
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.maleEquip1 = 23887;
            itemDef.femaleEquip1 = 23887;
            itemDef.name = "Zeus Shield";
			itemDef.modelZoom = 2000;
			itemDef.rotationX = 2;
			itemDef.modelOffsetY = -6;
			itemDef.modelOffsetX = 1;
            break;
            
            
        case 2749:
            itemDef.modelID = 23898;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.maleEquip1 = 23899;
            itemDef.femaleEquip1 = 23899;
            itemDef.name = "Hercules helm";
            break;
            
        case 2750:
            itemDef.modelID = 23900;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.maleEquip1 = 23901;
            itemDef.femaleEquip1 = 23901;
            itemDef.name = "Hercules fighterbody";
            break;
            
        case 2751:
            itemDef.modelID = 23902;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.maleEquip1 = 23903;
            itemDef.femaleEquip1 = 23903;
            itemDef.name = "Hercules fighterlegs";
            break;
            
            
        case 2753:
            itemDef.modelID = 23904;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.maleEquip1 = 23905;
            itemDef.femaleEquip1 = 23905;
            itemDef.name = "Hercules Kiteshield";
            break;
            
        case 2752:
            itemDef.modelID = 23906;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.maleEquip1 = 23907;
            itemDef.femaleEquip1 = 23907;
            itemDef.name = "Hercules fightercape";
            break;
            
        case 2754:
            itemDef.modelID = 23908;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.maleEquip1 = 23909;
            itemDef.femaleEquip1 = 23909;
            itemDef.name = "Hercules gloves";
            break;
            
        case 2755:
            itemDef.modelID = 23910;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.maleEquip1 = 23910;
            itemDef.femaleEquip1 = 23910;
            itemDef.name = "Hercules boots";
            break;
            
		case 1018:
			itemDef.modelID = 23960;
			itemDef.name = "Louis Head";
			itemDef.femaleEquip1 = 23961;
			itemDef.maleEquip1 = 23961;
			itemDef.description = "Louis' Head";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			itemDef.actions[4] = "Drop";
			break;
			
			
        case 1413:
            itemDef.name = "Sulpher Scythe";
            itemDef.modelID = 23962;
            itemDef.maleEquip1 = 23963;
            itemDef.femaleEquip1 = 23963;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.stackable = false;
            break;
            
            
        case 12426:
            itemDef.name = "Icy Glaive";
            itemDef.modelID = 23964;
            itemDef.maleEquip1 = 23965;
            itemDef.femaleEquip1 = 23965;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.stackable = false;
			itemDef.animateInventory = true;
			itemDef.originalModelColors = new int[] { 60, 62 };
			itemDef.newModelColor = new int[] { 51, 53 };
            break;
            
        case 5150:
            itemDef.name = "Gluttony glaive";
            itemDef.modelID = 23964;
            itemDef.maleEquip1 = 23965;
            itemDef.femaleEquip1 = 23965;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.stackable = false;
			itemDef.animateInventory = true;
			itemDef.originalModelColors = new int[] { 60, 62 };
			itemDef.newModelColor = new int[] { 51, 53 };
            break;
            
            
        case 15105:
            itemDef.name = "Mysterious Emblem(1)";
            break;
        case 15106:
            itemDef.name = "Mysterious Emblem(2)";
            break;
        case 15104:
            itemDef.name = "Mysterious Emblem(3)";
            break;
        case 15103:
            itemDef.name = "Mysterious Emblem(4)";
            break;
            
        case 14639:
            itemDef.name = "Soul Fragments";
            break;
            
        case 18811:
            itemDef.name = "Vader TP";
            break;
            
            
        case 3271:
            itemDef.modelID = 23915;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.maleEquip1 = 23916;
            itemDef.femaleEquip1 = 23916;
            itemDef.modelZoom = 1200;
            itemDef.rotationX = 0;
            itemDef.modelOffsetY = -6;
            itemDef.modelOffsetX = 1;
            itemDef.name = "Vader Helmet";
            break;
            
        case 3272:
            itemDef.modelID = 23917;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.maleEquip1 = 23918;
            itemDef.femaleEquip1 = 23918;
            itemDef.name = "Vader Platebody";
            break;
            
        case 3273:
            itemDef.modelID = 23919;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.maleEquip1 = 23919;
            itemDef.femaleEquip1 = 23919;
            itemDef.modelZoom = 1200;
            itemDef.rotationY = 50;
            itemDef.name = "Vader Platelegs";
            break;
            
		case 3283:
			itemDef.modelID = 23920;
			itemDef.name = "Vader Gloves";
			itemDef.description = "Death Is Upon Us!";
			itemDef.maleEquip1 = 23921;
			itemDef.femaleEquip1 = 23921;
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wear";
			itemDef.modelZoom = 672;
			itemDef.rotationY = 81;
			itemDef.rotationX = 1670;
			itemDef.modelOffsetX = 0;
			itemDef.modelOffsetY = 0;
			break;
			
		case 3284:
			itemDef.modelID = 23922;
			itemDef.name = "Vader Boots";
			itemDef.description = "Death Is Upon Us!";
			itemDef.maleEquip1 = 23922;
			itemDef.femaleEquip1 = 23922;
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wear";
			itemDef.modelZoom = 672;
			itemDef.rotationY = 81;
			itemDef.rotationX = 1670;
			itemDef.modelOffsetX = 0;
			itemDef.modelOffsetY = 0;
			break;
			
		case 3285:
			itemDef.modelID = 23923;
			itemDef.name = "Vader Cape";
			itemDef.description = "Death Is Upon Us!";
			itemDef.maleEquip1 = 23924;
			itemDef.femaleEquip1 = 23924;
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Wear";
			itemDef.modelZoom = 672;
			itemDef.rotationY = 81;
			itemDef.rotationX = 1670;
			itemDef.modelOffsetX = 0;
			itemDef.modelOffsetY = 0;
			break;

			case 11526:
				itemDef.modelID = 95079;
				itemDef.name = "Oogle's body";
				itemDef.description = "Must be a powerful platebody for it to be oogles?";
				itemDef.modelZoom = 1828;
				itemDef.rotationY = 539;
				itemDef.rotationX = 0;
				itemDef.modelOffset1 = -1;
				itemDef.modelOffsetY = 0;
				itemDef.maleEquip1 = 95076;
				itemDef.femaleEquip1 = 95076;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				break;

			case 11527:
				itemDef.modelID = 95078;
				itemDef.name = "Oogle's legs";
				itemDef.description = "Must be a powerful legs for it to be oogles?";
				itemDef.modelZoom = 1828;
				itemDef.rotationY = 539;
				itemDef.rotationX = 0;
				itemDef.modelOffset1 = -1;
				itemDef.modelOffsetY = 0;
				itemDef.maleEquip1 = 95075;
				itemDef.femaleEquip1 = 95075;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				break;

			case 11528:
				itemDef.modelID = 95077;
				itemDef.name = "Oogle's helm";
				itemDef.description = "Must be a powerful helm for it to be oogles?";
				itemDef.modelZoom = 1828;
				itemDef.rotationY = 539;
				itemDef.rotationX = 0;
				itemDef.modelOffset1 = -1;
				itemDef.modelOffsetY = 0;
				itemDef.maleEquip1 = 95074;
				itemDef.femaleEquip1 = 95074;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				break;

			case 6307:
				itemDef.modelID = 90571;
				itemDef.name = "Dark Ranger's body";
				itemDef.description = "Carved from the exo-skeleton of Jad itself";
				itemDef.modelZoom = 1828;
				itemDef.rotationY = 539;
				itemDef.rotationX = 0;
				itemDef.modelOffset1 = -1;
				itemDef.modelOffsetY = 0;
				itemDef.maleEquip1 = 90572;
				itemDef.femaleEquip1 = 90572;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				break;
			case 6308:
				itemDef.modelID = 90573;
				itemDef.name = "Dark Ranger's platelegs";
				itemDef.description = "Carved from the exo-skeleton of Jad itself";
				itemDef.modelZoom = 1828;
				itemDef.rotationY = 539;
				itemDef.rotationX = 0;
				itemDef.modelOffset1 = -1;
				itemDef.modelOffsetY = 0;
				itemDef.maleEquip1 = 90574;
				itemDef.femaleEquip1 = 90574;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				break;
			case 6309:
				itemDef.modelID = 90575;
				itemDef.name = "Dark Ranger's cloak";
				itemDef.description = "Carved from the exo-skeleton of Jad itself";
				itemDef.modelOffset1 = 0;
				itemDef.modelOffsetY = 1;
				itemDef.stackable = false;
				itemDef.modelZoom = 2128;
				itemDef.rotationY = 504;
				itemDef.rotationX = 0;
				itemDef.maleEquip1 = 90576;
				itemDef.femaleEquip1 = 90576;
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				break;
			case 6310:
				itemDef.modelID = 90577;
				itemDef.name = "Dark Ranger's boots";
				itemDef.description = "Carved from the exo-skeleton of Jad itself";
				itemDef.modelZoom = 676;
				itemDef.rotationY = 63;
				itemDef.rotationX = 106;
				itemDef.modelOffset1 = 5;
				itemDef.modelOffsetY = -1;
				itemDef.maleEquip1 = 90578;
				itemDef.femaleEquip1 = 90578;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				break;

			case 6311:
				itemDef.modelID = 90579;
				itemDef.name = "Dark Ranger's gloves";
				itemDef.description = "Carved from the exo-skeleton of Jad itself";
				itemDef.modelZoom = 648;
				itemDef.rotationY = 618;
				itemDef.rotationX = 1143;
				itemDef.modelOffset1 = 0;
				itemDef.modelOffsetY = -5;
				itemDef.maleEquip1 = 90580;
				itemDef.femaleEquip1 = 90580;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				break;

			case 6312:
				itemDef.modelID = 90581;
				itemDef.name = "Dark Ranger's helm";
				itemDef.description = "Carved from the exo-skeleton of Jad itself";
				itemDef.modelZoom = 672;
				itemDef.rotationY = 85;
				itemDef.rotationX = 1867;
				itemDef.modelOffset1 = 0;
				itemDef.modelOffsetY = -3;
				itemDef.maleEquip1 = 90582;
				itemDef.femaleEquip1 = 90582;
				itemDef.groundActions = new String[5];
				itemDef.groundActions[2] = "Take";
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wear";
				itemDef.actions[4] = "Drop";
				break;
            
		case 17904:
			itemDef.name = "Ragnorak helmet";
			itemDef.modelID = 23460;
			itemDef.femaleEquip1 = 23459; //65343
			itemDef.maleEquip1 = 23459; //65343
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
			break;	
			
		case 17906:
			itemDef.name = "Ragnorak platebody";
			itemDef.modelID = 23456;
			itemDef.femaleEquip1 = 23455;
			itemDef.maleEquip1 = 23455;
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
			break;
			
		case 17907:
			itemDef.name = "Ragnorak platelegs";
			itemDef.modelID = 23458;
			itemDef.femaleEquip1 = 23457;
			itemDef.maleEquip1 = 23457;
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
			break;
			
		case 17919:
			itemDef.name = "Ragnorak cape";
			itemDef.modelID = 23460;
			itemDef.femaleEquip1 = 23461;
			itemDef.maleEquip1 = 23461;
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
			break;

			case 18834:
				ItemDef.copyModel(itemDef, 526);
				itemDef.name = "Pumkin bone";
				itemDef.description = "Since when did pumpkins have bones?";
				break;
			
		case 936:
			itemDef.name = "Dragonslayer helmet";
			itemDef.modelID = 23433;
			itemDef.femaleEquip1 = 23434; //65343
			itemDef.maleEquip1 = 23434; //65343
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
			break;	
			
		case 937:
			itemDef.name = "Dragonslayer platebody";
			itemDef.modelID = 23435;
			itemDef.femaleEquip1 = 23436;
			itemDef.maleEquip1 = 23436;
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
			break;
			
			
			
		case 938:
			itemDef.name = "Dragonslayer platelegs";
			itemDef.modelID = 23437;
			itemDef.femaleEquip1 = 23438;
			itemDef.maleEquip1 = 23438;
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
			break;
			
		case 939:
			itemDef.name = "Dragonslayer cape";
			itemDef.modelID = 23439;
			itemDef.femaleEquip1 = 23439;
			itemDef.maleEquip1 = 23439;
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
			break;
			
		case 19124:
			itemDef.name = "Leafy monarch helmet";
			itemDef.modelID = 23151;
			itemDef.femaleEquip1 = 23152; //65343
			itemDef.maleEquip1 = 23152; //65343
			changeTexture(id, 70, 72);
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
			break;	
		case 19125:
			itemDef.name = "Leafy monarch platebody";
			itemDef.modelID = 23149;
			itemDef.femaleEquip1 = 23150;
			itemDef.maleEquip1 = 23150;
			changeTexture(id, 70, 72);
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
			break;	
		case 19126:
			itemDef.name = "Leafy monarch platelegs";
			itemDef.modelID = 23147;
			itemDef.femaleEquip1 = 23148;
			itemDef.maleEquip1 = 23148; //65349
			changeTexture(id, 70, 72);
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
			break;	
		case 19127:
			itemDef.name = "Noxious gauntlets";
			itemDef.modelID = 23145;
			itemDef.femaleEquip1 = 23146;
			itemDef.maleEquip1 = 23146; //65350
			changeTexture(id, 70, 71);
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
			break;	
		case 19128:
			itemDef.name = "Noxious boots";
			itemDef.modelID = 23144;
			itemDef.femaleEquip1 = 23144;
			itemDef.maleEquip1 = 23144;
			changeTexture(id, 70, 71);
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
			break;	
		case 19129:
			itemDef.name = "Noxious drape";
			itemDef.modelID = 23143;
			itemDef.femaleEquip1 = 23142;
			itemDef.maleEquip1 = 23142;
			changeTexture(id, 70, 71);
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
			break;	
			
		case 935:
			itemDef.name = "Youtubers Cape";
			itemDef.modelID = 23439;
			itemDef.femaleEquip1 = 23439;
			itemDef.maleEquip1 = 23439;
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
			break;	

		case 925:
			itemDef.name = "Lucid blade";
			itemDef.modelID = 23425;
			itemDef.femaleEquip1 = 23424;
			itemDef.maleEquip1 = 23424;
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
			break;	
			
			
		case 3278:
			itemDef.name = "RWB Glaive";
			itemDef.modelID = 23531;
			itemDef.femaleEquip1 = 23532;
			itemDef.maleEquip1 = 23532;
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
			break;	
			
		case 3279:
			itemDef.name = "Zamrorak Blade";
			itemDef.modelID = 23533;
			itemDef.femaleEquip1 = 23534;
			itemDef.maleEquip1 = 23534;
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
			break;	
			
            
        case 3282:
            itemDef.modelID = 23539;
            itemDef.stackable = false;
            itemDef.name = "God Staff";
            itemDef.description = "You must be a baller to own this one.";
            itemDef.maleEquip1 = 23540;
            itemDef.femaleEquip1 = 23540;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
            break;
			
			
		case 3280:
			itemDef.modelID = 23535;
			itemDef.name = "Youtuber Aura";
			itemDef.femaleEquip1 = 23536;
			itemDef.maleEquip1 = 23536;
			itemDef.description = "Flex the yters";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			itemDef.actions[4] = "Drop";
			break;
			
		case 3281:
			itemDef.modelID = 23537;
			itemDef.name = "Youtubers Amulet";
			itemDef.femaleEquip1 = 23538;
			itemDef.maleEquip1 = 23538;
			itemDef.description = "Flex the yters";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			itemDef.actions[4] = "Drop";
			break;
			
		case 933:
			itemDef.name = " Legends Glaive";
            itemDef.modelID = 23964;
            itemDef.maleEquip1 = 23965;
            itemDef.femaleEquip1 = 23965;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.stackable = false;
			itemDef.animateInventory = true;
			itemDef.originalModelColors = new int[] { 60, 62 };
			itemDef.newModelColor = new int[] { 55, 64};
            break;
			
			
		case 17931:
			itemDef.name = "Sire's Glaive";
			itemDef.modelID = 23470;
			itemDef.femaleEquip1 = 23471;
			itemDef.maleEquip1 = 23471;
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
			break;	
		case 3905:
			itemDef.name = "Kings cape";
			break;
			
		case 17932:
			itemDef.modelID = 23472;
			itemDef.name = "Luigi's Head";
			itemDef.femaleEquip1 = 23473;
			itemDef.maleEquip1 = 23473;
			itemDef.description = "Luigi's head";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			
			itemDef.actions[4] = "Drop";
			break;
			
  		case 5118:
			itemDef.name = "Satanic Helmet";
			itemDef.modelID = 40080;
			itemDef.maleEquip1 = 40081;
			itemDef.femaleEquip1 = 40081;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
  		case 5119:
			itemDef.name = "Satanic Body";
			itemDef.modelID = 40082;
			itemDef.maleEquip1 = 40083;
			itemDef.femaleEquip1 = 40083;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
  		case 5120:
			itemDef.name = "Satanic Legs";
			itemDef.modelID = 40084;
			itemDef.maleEquip1 = 40085;
			itemDef.femaleEquip1 = 40085;
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
			
			
		case 15255:
 			itemDef.modelID = 40234;
 			itemDef.name = "Pennywise mask";
 			itemDef.description = "pennywise set";
            itemDef.modelZoom = 900;
            itemDef.rotationY = 100;
 			itemDef.rotationX = 0;
 			itemDef.modelOffset1 = -1;
 			itemDef.modelOffsetY = -1;
 			itemDef.maleEquip1 = 40235;
 			itemDef.femaleEquip1 = 40235;
 			itemDef.actions = new String[5];
 			itemDef.actions[1] = "Wear";
 			itemDef.actions[4] = "Drop";
 			break;
 			
 		case 15256:
 			itemDef.modelID = 40236;
 			itemDef.name = "Pennywise Legs";
 			itemDef.description = "pennywise set";
            itemDef.modelZoom = 1800;
            itemDef.rotationY = 500;
 			itemDef.rotationX = 0;
 			itemDef.modelOffset1 = -1;
 			itemDef.modelOffsetY = -1;
 			itemDef.maleEquip1 = 40237;
 			itemDef.femaleEquip1 = 40237;
 			itemDef.actions = new String[5];
 			itemDef.actions[1] = "Wear";
 			itemDef.actions[4] = "Drop";
 			break;
 			
 		case 15257:
 			itemDef.modelID = 40230;
 			itemDef.name = "Pennywise Body";
 			itemDef.description = "pennywise set";
 		     itemDef.modelZoom = 1500;
            itemDef.rotationY = 500;
 			itemDef.rotationX = 0;
 			itemDef.modelOffset1 = -1;
 			itemDef.modelOffsetY = -1;
 			itemDef.maleEquip1 = 40231;
 			itemDef.femaleEquip1 = 40231;
 			itemDef.actions = new String[5];
 			itemDef.actions[1] = "Wear";
 			itemDef.actions[4] = "Drop";
 			break;
 			
		case 15258:
 			itemDef.modelID = 40232;
 			itemDef.name = "Pennywise Gloves";
 			itemDef.description = "pennywise set";
		     itemDef.modelZoom = 1000;
             itemDef.rotationY = 500;
  			itemDef.rotationX = 0;
  			itemDef.modelOffset1 = -1;
  			itemDef.modelOffsetY = -1;
 			itemDef.maleEquip1 = 40233;
 			itemDef.femaleEquip1 = 40233;
 			itemDef.actions = new String[5];
 			itemDef.actions[1] = "Wear";
 			itemDef.actions[4] = "Drop";
 			break;
 			
		case 15268:
 			itemDef.modelID = 40228;
 			itemDef.name = "Pennywise Boots";
 			itemDef.description = "pennywise set";
 		     itemDef.modelZoom = 1000;
             itemDef.rotationY = 500;
  			itemDef.rotationX = 0;
  			itemDef.modelOffset1 = -1;
  			itemDef.modelOffsetY = -1;
 			itemDef.maleEquip1 = 40229;
 			itemDef.femaleEquip1 = 40229;
 			itemDef.actions = new String[5];
 			itemDef.actions[1] = "Wear";
 			itemDef.actions[4] = "Drop";   
 			break;
			
			
		case 17933:
			itemDef.modelID = 23475;
			itemDef.name = "Mario's Head";
			itemDef.femaleEquip1 = 23476;
			itemDef.maleEquip1 = 23476;
			itemDef.description = "Mario's head";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			
			itemDef.actions[4] = "Drop";
			break;
			
		case 934:
			itemDef.name = "Mask of the Dead";
			itemDef.modelID = 23430;
			itemDef.femaleEquip1 = 23431;
			itemDef.maleEquip1 = 23431;
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
			break;	
			
		case 5185:
			ItemDef.copyModel(itemDef, 15332);
			itemDef.name = "Infinite Overload Potion";
			itemDef.animateInventory = true;
			break;
			
		case 3961:
			ItemDef.copyModel(itemDef, 15332);
			itemDef.name = "Eternal Potion";
			itemDef.animateInventory = true;
			break;
			
		case 19140:
			itemDef.modelID = 23422;
			itemDef.name = "Ring of Overload";
			itemDef.animateInventory = true;
            itemDef.actions[1] = "Wear";
 		   
            itemDef.actions[4] = "Drop";
			itemDef.rotationX = 320; // the rotation x u chose in editor
			itemDef.rotationY = 270; 
			break;
			
		case 19141:
			itemDef.modelID = 23423;
			itemDef.name = "Ring of Overload+";
			itemDef.animateInventory = true;
            itemDef.actions[1] = "Wear";
 		   
            itemDef.actions[4] = "Drop";
			itemDef.rotationX = 320; // the rotation x u chose in editor
			itemDef.rotationY = 270; 
			break;
			
		case 19142:
			itemDef.modelID = 23426;
			itemDef.name = "Ring of Overload++";
			itemDef.animateInventory = true;
            itemDef.actions[1] = "Wear";
 		   
            itemDef.actions[4] = "Drop";
			itemDef.rotationX = 320; // the rotation x u chose in editor
			itemDef.rotationY = 270; 
			break;

		case 5183:
			ItemDef.copyModel(itemDef, 3316);
			itemDef.originalModelColors = new int[] { 62 };
			itemDef.newModelColor = new int[] { 68 };
			itemDef.name = "Texturized Range SS";
			itemDef.animateInventory = true;
			break;
			
		case 15045:
			ItemDef.copyModel(itemDef, 3316);
			itemDef.originalModelColors = new int[] { 62 };
			itemDef.newModelColor = new int[] { 71 };
			itemDef.name = "Aquatic Shield";
			itemDef.animateInventory = true;
			break;

		case 18749:
			ItemDef.copyModel(itemDef, 3316);
			changeTexture(id, 62, 58);
			itemDef.name = "Forest Shield";
			itemDef.animateInventory = true;
			break;
			
		case 19475:
			itemDef.name = "Dungeon Floor 2 teleport";
					break;
					
		case 17922:
			ItemDef.copyModel(itemDef, 19475);
			itemDef.name = "Dungeon Floor 2 teleport";
					break;
					
					
		case 17926:
			itemDef.modelID = 23466;
			itemDef.name = "Ice Breaker MainHand";
			itemDef.modelZoom = 2000;
			itemDef.rotationY = 0;
			itemDef.rotationX = 0;
			itemDef.modelOffsetX = 0;
			itemDef.modelOffsetY = 5;
			itemDef.femaleEquip1 = 23466;
			itemDef.maleEquip1 = 23466;
			itemDef.description = "Only the finest warriors have this Weapon";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			
			itemDef.actions[4] = "Drop";
			break;
		case 17927:
			itemDef.modelID = 23467;
			itemDef.name = "Ice Breaker OffHand";
			itemDef.modelZoom = 2000;
			itemDef.rotationY = 0;
			itemDef.rotationX = 0;
			itemDef.modelOffsetX = 0;
			itemDef.modelOffsetY = 5;
			itemDef.femaleEquip1 = 23467;
			itemDef.maleEquip1 = 23467;
			itemDef.description = "Only the finest warriors have this Weapon";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			
			itemDef.actions[4] = "Drop";
			break;
		case 17929:
			itemDef.modelID = 23468;
			itemDef.name = "Fire Breaker (MH)";
			itemDef.modelZoom = 2000;
			itemDef.rotationY = 0;
			itemDef.rotationX = 0;
			itemDef.modelOffsetX = 0;
			itemDef.modelOffsetY = 5;
			itemDef.femaleEquip1 = 23468;
			itemDef.maleEquip1 = 23468;
			itemDef.description = "Only the finest warriors have this Weapon";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			
			itemDef.actions[4] = "Drop";
			break;
		case 17928:
			itemDef.modelID = 23469;
			itemDef.name = "Fire Breaker (OH)";
			itemDef.modelZoom = 2000;
			itemDef.rotationY = 0;
			itemDef.rotationX = 0;
			itemDef.modelOffsetX = 0;
			itemDef.modelOffsetY = 5;
			itemDef.femaleEquip1 = 23469;
			itemDef.maleEquip1 = 23469;
			itemDef.description = "Only the finest warriors have this Weapon";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			
			itemDef.actions[4] = "Drop";
			break;
					
					
		case 17923:
			ItemDef.copyModel(itemDef, 1481);
			itemDef.name = "Hellfire orbs";
					break;
					
		case 17924:
			ItemDef.copyModel(itemDef, 13149);
			itemDef.name = "Nomads Tickets";
					break;
					
		case 18750:
			ItemDef.copyModel(itemDef, 19088);
			changeTexture(id, 40, 70);
			itemDef.name = "Demonic Olm Partyhat (2%Dr)";
			itemDef.animateInventory = true;
			break;
			
		case 18751:
			ItemDef.copyModel(itemDef, 4775);
			changeTexture(id, 40, 70);
			itemDef.name = "Demonic Olm Gloves (2%Dr)";
			itemDef.animateInventory = true;
			break;
			
		case 5210:
			ItemDef.copyModel(itemDef, 3316);
			itemDef.originalModelColors = new int[] { 62 };
			itemDef.newModelColor = new int[] { 72 };
			itemDef.name = "Toxic Shield";
			itemDef.animateInventory = true;
			break;
			
		case 5211:
			ItemDef.copyModel(itemDef, 3316);
			itemDef.originalModelColors = new int[] { 62 };
			itemDef.newModelColor = new int[] { 64 };
			itemDef.name = "Elemental Shield";
			itemDef.animateInventory = true;
			break;
			
			
		case 5170:
			ItemDef.copyModel(itemDef, 19476);
			itemDef.name = "Unlimited Prayer Scroll";
			itemDef.animateInventory = true;
			break;
			
		case 13088:
			itemDef.name = "VIP Battlesword";
			ItemDef itemdef4 = ItemDef.forID(7158);
			itemDef.modelID = 23411;
			itemDef.femaleEquip1 = 23412;
			itemDef.maleEquip1 = 23412;
			itemDef.modelOffset1 = itemdef4.modelOffset1;
			itemDef.modelOffsetX = itemdef4.modelOffsetX;
			itemDef.modelOffsetY = itemdef4.modelOffsetY;
			itemDef.modelZoom = itemdef4.modelZoom;
			itemDef.rotationX = itemdef4.rotationX;
			itemDef.rotationY = itemdef4.rotationY;
			itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
			break;
			
        case 5184:
            itemDef.modelID = 23409;
            itemDef.stackable = false;
            itemDef.name = "TeddyBear";
            itemDef.description = "Gives you that extra bit of luck!";
            itemDef.maleEquip1 = 23410;
            itemDef.femaleEquip1 = 23410;
            itemDef.actions = new String[5];
            itemDef.modelZoom = 800;
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
            break;

			
        case 13087:
            itemDef.modelID = 23409;
            itemDef.stackable = false;
            itemDef.name = "TeddyBear";
            itemDef.description = "Gives you that extra bit of luck!";
            itemDef.maleEquip1 = 23410;
            itemDef.femaleEquip1 = 23410;
            itemDef.actions = new String[5];
            itemDef.modelZoom = 800;
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
            break;
            
            
        case 2547:
            itemDef.modelID = 23499;
            itemDef.stackable = false;
            itemDef.name = "Ocean TeddyBear";
            itemDef.description = "Gives you that extra bit of luck!";
            itemDef.maleEquip1 = 23498;
            itemDef.femaleEquip1 = 23498;
            itemDef.actions = new String[5];
            itemDef.modelZoom = 800;
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
            break;
            
        case 2548:
            itemDef.modelID = 23501;
            itemDef.stackable = false;
            itemDef.name = "Abyssal TeddyBear";
            itemDef.description = "Gives you that extra bit of luck!";
            itemDef.maleEquip1 = 23500;
            itemDef.femaleEquip1 = 23500;
            itemDef.actions = new String[5];
            itemDef.modelZoom = 800;
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
            break;
            
        case 3075:
            itemDef.modelID = 23515;
            itemDef.stackable = false;
            itemDef.name = "Sires Boots";
            itemDef.description = "if you got these your in for a upgrade soon!";
            itemDef.maleEquip1 = 23515;
            itemDef.femaleEquip1 = 23515;
            itemDef.actions = new String[5];
            itemDef.modelZoom = 800;
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
            break;
            
        case 3076:
            itemDef.modelID = 23517;
            itemDef.stackable = false;
            itemDef.name = "Sires Helmet";
            itemDef.description = "if you got these your in for a upgrade soon!";
            itemDef.maleEquip1 = 23516;
            itemDef.femaleEquip1 = 23516;
            itemDef.actions = new String[5];
            itemDef.modelZoom = 800;
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
            break;
            
        case 3078:
            itemDef.modelID = 23519;
            itemDef.stackable = false;
            itemDef.name = "Sires Gloves";
            itemDef.description = "if you got these your in for a upgrade soon!";
            itemDef.maleEquip1 = 23518;
            itemDef.femaleEquip1 = 23518;
            itemDef.actions = new String[5];
            itemDef.modelZoom = 800;
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
            break;
            
        case 3242:
            itemDef.modelID = 23521;
            itemDef.stackable = false;
            itemDef.name = "Sires Platebody";
            itemDef.description = "if you got these your in for a upgrade soon!";
            itemDef.maleEquip1 = 23520;
            itemDef.femaleEquip1 = 23520;
            itemDef.actions = new String[5];
            itemDef.modelZoom = 800;
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
            break;
            
        case 3244:
            itemDef.modelID = 23523;
            itemDef.stackable = false;
            itemDef.name = "Sires Platelegs";
            itemDef.description = "Gives you that extra bit of luck!";
            itemDef.maleEquip1 = 23522;
            itemDef.femaleEquip1 = 23522;
            itemDef.actions = new String[5];
            itemDef.modelZoom = 800;
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
            break;
            
            
        case 3250:
            itemDef.modelID = 23525;
            itemDef.stackable = false;
            itemDef.name = "Sires Staff";
            itemDef.description = "Gives you that extra bit of luck!";
            itemDef.maleEquip1 = 23524;
            itemDef.femaleEquip1 = 23524;
            itemDef.actions = new String[5];
            itemDef.modelZoom = 800;
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
            break;
            
            
        case 3254:
            itemDef.modelID = 23526;
			itemDef.modelZoom = 3000; // the zoom u chose in editor
			itemDef.rotationX = 1760; // the rotation x u chose in editor
			itemDef.rotationY = 533;
			itemDef.stackable = false;
            itemDef.name = "Elemental Off-hand";
            itemDef.description = "what a masterpiece";
            itemDef.maleEquip1 = 23527;
            itemDef.femaleEquip1 = 23527;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
            break;
            
        case 2771:
            itemDef.modelID = 23504;
            itemDef.stackable = false;
            itemDef.name = "Tainted Helmet";
            itemDef.description = "Gives you that extra bit of luck!";
            itemDef.maleEquip1 = 23503;
            itemDef.femaleEquip1 = 23503;
            itemDef.actions = new String[5];
            itemDef.modelZoom = 800;
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
            break;
            
        case 2772:
            itemDef.modelID = 23506;
            itemDef.stackable = false;
            itemDef.name = "Tainted Gloves";
            itemDef.description = "Gives you that extra bit of luck!";
            itemDef.maleEquip1 = 23505;
            itemDef.femaleEquip1 = 23505;
            itemDef.actions = new String[5];
            itemDef.modelZoom = 800;
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
            break;
            
        case 2867:
            itemDef.modelID = 23508;
            itemDef.stackable = false;
            itemDef.name = "Tainted Platebody";
            itemDef.description = "Gives you that extra bit of luck!";
            itemDef.maleEquip1 = 23507;
            itemDef.femaleEquip1 = 23507;
            itemDef.actions = new String[5];
            itemDef.modelZoom = 800;
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
            break;
            
        case 2868:
            itemDef.modelID = 23510;
            itemDef.stackable = false;
            itemDef.name = "Tainted Platelegs";
            itemDef.description = "Gives you that extra bit of luck!";
            itemDef.maleEquip1 = 23509;
            itemDef.femaleEquip1 = 23509;
            itemDef.actions = new String[5];
            itemDef.modelZoom = 800;
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
            break;
            
            
        case 2869:
            itemDef.modelID = 23512;
            itemDef.stackable = false;
            itemDef.name = "Tainted Cape";
            itemDef.description = "Gives you that extra bit of luck!";
            itemDef.maleEquip1 = 23511;
            itemDef.femaleEquip1 = 23511;
            itemDef.actions = new String[5];
            itemDef.modelZoom = 800;
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
            break;
            
        case 2870:
            itemDef.modelID = 23514;
            itemDef.stackable = false;
            itemDef.name = "Tainted Shield";
            itemDef.description = "Gives you that extra bit of luck!";
            itemDef.maleEquip1 = 23513;
            itemDef.femaleEquip1 = 23513;
            itemDef.actions = new String[5];
            itemDef.modelZoom = 800;
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
            break;
            
            
        case 2545:
            itemDef.modelID = 23497;
            itemDef.stackable = false;
            itemDef.name = "Panda Teddybear";
            itemDef.description = "Gives you that extra bit of luck!";
            itemDef.maleEquip1 = 23496;
            itemDef.femaleEquip1 = 23496;
            itemDef.actions = new String[5];
            itemDef.modelZoom = 800;
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
            break;
            
        case 2546:
            itemDef.modelID = 23495;
            itemDef.stackable = false;
            itemDef.name = "Rasta Teddy";
            itemDef.description = "Gives you that extra bit of luck!";
            itemDef.maleEquip1 = 23492;
            itemDef.femaleEquip1 = 23492;
            itemDef.actions = new String[5];
            itemDef.modelZoom = 800;
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
            break;
            
        case 7617:
            itemDef.modelID = 23413;
            itemDef.stackable = false;
            itemDef.name = "Donators TeddyBear";
            itemDef.description = "Gives you that extra bit of luck!";
            itemDef.maleEquip1 = 23414;
            itemDef.femaleEquip1 = 23414;
            itemDef.actions = new String[5];
            itemDef.modelZoom = 800;
            itemDef.actions[1] = "Wear";
			
            itemDef.actions[4] = "Drop";
            break;

		case 5197:
			ItemDef.copyModel(itemDef, 19476);
			itemDef.name = "10% Permanent Dr Scroll";
			itemDef.animateInventory = true;
			break;
			
		case 12162:
			itemDef.name = "1k Lazy Charm";
            itemDef.actions = new String[5];
            itemDef.actions[2] = "Claim";
			break;
			
		case 12164:
			itemDef.name = "5k Lazy Charm";
            itemDef.actions = new String[5];
            itemDef.actions[2] = "Claim";
			break;
			
		case 18392:
			ItemDef.copyModel(itemDef, 19476);
			itemDef.name = "2% Permanent Dr Scroll";
			itemDef.animateInventory = true;
			break;
			
		case 18401:
			ItemDef.copyModel(itemDef, 19476);
			itemDef.name = "3% Permanent Dr Scroll";
			itemDef.originalModelColors = new int[] { 58 };
			itemDef.newModelColor = new int[] { 64 };
			itemDef.animateInventory = true;
			break;

		case 5168:
			ItemDef.copyModel(itemDef, 19476);
			itemDef.name = "Hellfire Scroll";
			itemDef.animateInventory = true;
			break;

		case 19821:
			itemDef.name = "2% Dr Boots";
			itemDef.stackable = false;
			ItemDef.copyModel(itemDef, 4803);
			itemDef.originalModelColors = new int[] { 40 };
			itemDef.newModelColor = new int[] { 62 };
			break;

			case 18343:
				itemDef.name = "Name Change Scroll";
				itemDef.stackable = true;
				break;
			
		case 4803:
			itemDef.name = "2% DR Boots";
			itemDef.stackable = false;
			break;
			
		case 5052:
			ItemDef.copyModel(itemDef, 4803);
			itemDef.originalModelColors = new int[] { 40 };
			itemDef.newModelColor = new int[] { 62 };
			itemDef.name = "OP Primordial Boots";
			itemDef.stackable = false;
			break;

		case 5195:
			ItemDef.copyModel(itemDef, 3990);
			itemDef.name = "Hulk Minigun";
			itemDef.originalModelColors = new int[] { 40, 24 };
			itemDef.newModelColor = new int[] { 58, 58 };
			break;

		case 5158:
			ItemDef.copyModel(itemDef, 3990);
			itemDef.name = "Vprs Lavagun";
			itemDef.originalModelColors = new int[] { 24 };
			itemDef.newModelColor = new int[] { 57 };
			break;

		/*
		 * case 19821: itemDef.originalModelColors = new int[2]; itemDef.newModelColor =
		 * new int[2]; itemDef.originalModelColors[0] = 51; itemDef.newModelColor[0] =
		 * 58; itemDef.originalModelColors[1] = 60; itemDef.newModelColor[1] = 59;
		 * itemDef.modelID = 94700; itemDef.maleEquip1 = 94700; itemDef.femaleEquip1 =
		 * 94700; itemDef.modelZoom = 1000; itemDef.modelOffset1 = 0;
		 * itemDef.modelOffsetX = 0; itemDef.rotationX = 2020; itemDef.rotationY = 333;
		 * itemDef.actions = new String[5]; itemDef.actions[1] = "Wear"; itemDef.name =
		 * "50% DR Increasing Boots"; break;
		 */

		case 5159:
			ItemDef.copyModel(itemDef, 20054);
			itemDef.name = "Vpr's God Ring";
			break;
			
		case 8851:
			itemDef.name = "Frankenstein Tokens";
			break;

		case 5179:
			ItemDef.copyModel(itemDef, 3951);
			itemDef.name = "Hellfire Battlestaff";
			itemDef.originalModelColors = new int[] { 40 };
			itemDef.newModelColor = new int[] { 59 };
			break;
			
		case 5204:
			ItemDef.copyModel(itemDef, 19943);
			itemDef.name = "Genesis nub cape";
			itemDef.modelID = 99888;
			itemDef.maleEquip1 = 99889;
			itemDef.femaleEquip1 = 99890;
			itemDef.originalModelColors = new int[] {978, 945, 968, 960, 65535};
			itemDef.newModelColor = new int[] {40459, 40665, 40549, 40652, 40665};
			break;

		case 19996:
			ItemDef.copyModel(itemDef, 5153);
			itemDef.name = "Dragon Pet Scroll";
			itemDef.actions = new String[] { "Open Interface", null, null, null, null };
			break;

		case 5129:
			ItemDef.copyModel(itemDef, 3951);
			itemDef.name = "Heated Battlestaff";
			break;

		case 19079:
			itemDef.actions = new String[] { null, null, null, null, null };
			break;

		case 19080:
			itemDef.actions = new String[] { "Bury", null, null, null, null };
			break;

        case 920:
            itemDef.modelID = 23122;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.modelZoom = 2000;
            itemDef.rotationX = 0;
            itemDef.modelOffsetY = -6;
            itemDef.modelOffsetX = 1;
            itemDef.maleEquip1 = 23122;
            itemDef.femaleEquip1 = 23122;
            itemDef.name = "Fuzed Goku Boots";
            break;
            
        case 13728:
            itemDef.modelID = 23378;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.modelZoom = 2000;
            itemDef.rotationX = 0;
            itemDef.modelOffsetY = -6;
            itemDef.modelOffsetX = 1;
            itemDef.maleEquip1 = 23379;
            itemDef.femaleEquip1 = 23379;
            itemDef.name = "helmet";
            break;
            
        case 13729:
            itemDef.modelID = 23380;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.modelZoom = 2000;
            itemDef.rotationX = 0;
            itemDef.modelOffsetY = -6;
            itemDef.modelOffsetX = 1;
            itemDef.maleEquip1 = 23381;
            itemDef.femaleEquip1 = 23381;
            itemDef.name = "platebody";
            break;
            
            
        case 13730:
            itemDef.modelID = 23382;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.modelZoom = 2000;
            itemDef.rotationX = 0;
            itemDef.modelOffsetY = -6;
            itemDef.modelOffsetX = 1;
            itemDef.maleEquip1 = 23383;
            itemDef.femaleEquip1 = 23383;
            itemDef.name = "platelegs";
            break;
        case 916:
            itemDef.modelID = 23124;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.modelZoom = 2000;
            itemDef.rotationX = 0;
            itemDef.modelOffsetY = -6;
            itemDef.modelOffsetX = 1;
            itemDef.maleEquip1 = 23123;
            itemDef.femaleEquip1 = 23123;
            itemDef.name = "Fuzed Goku Helmet";
            break;
            
        case 917:
            itemDef.modelID = 23126;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.modelZoom = 2000;
            itemDef.rotationX = 0;
            itemDef.modelOffsetY = -6;
            itemDef.modelOffsetX = 1;
            itemDef.maleEquip1 = 23125;
            itemDef.femaleEquip1 = 23125;
            itemDef.name = "Fuzed Goku Legs";
            break;
            
        case 918:
            itemDef.modelID = 23128;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.modelZoom = 2000;
            itemDef.rotationX = 0;
            itemDef.modelOffsetY = -6;
            itemDef.modelOffsetX = 1;
            itemDef.maleEquip1 = 23127;
            itemDef.femaleEquip1 = 23127;
            itemDef.name = "Fuzed Goku Platebody";
            break;
            
        case 921:
            itemDef.modelID = 23779;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.modelZoom = 2000;
            itemDef.rotationX = 0;
            itemDef.modelOffsetY = -6;
            itemDef.modelOffsetX = 1;
            itemDef.maleEquip1 = 23778;
            itemDef.femaleEquip1 = 23778;
            itemDef.name = "Fuzed Goku Gloves";
            break;

        case 1499:
            itemDef.name = "Defenders amulet";
            itemDef.actions[1] = "Wield";
            break;

            case 11179:
            	itemDef.name = "Aoe Instance Token";
				itemDef.stackable = true;
				break;
            
        case 15012:
            itemDef.name = "Defenders ring (i)";
            itemDef.actions[1] = "Wield";
            break;
            
        case 19158:
            itemDef.modelID = 40249;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.modelZoom = 2000;
            itemDef.rotationX = 0;
            itemDef.modelOffsetY = -6;
            itemDef.modelOffsetX = 1;
            itemDef.maleEquip1 = 40249;
            itemDef.femaleEquip1 = 40249;
            itemDef.name = "Sephiroth's gloves";
            break;
        case 19619:
            itemDef.modelID = 28377;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.maleEquip1 = 28378;
            itemDef.femaleEquip1 = 28378;
            itemDef.name = "Heated Helmet";
            break;
            
        case 732:
			ItemDef.copyModel(itemDef, 7478);
            itemDef.name = "DBZ Token";
            break;
            
        case 1543:
            itemDef.actions = new String[5];
            itemDef.actions[2] = "Open";
            itemDef.modelID = 23375;
            itemDef.name = "Medium Key";
            break;
            
            
        case 3921:
            itemDef.actions = new String[5];
            itemDef.actions[2] = "Open";
            itemDef.modelID = 23375;
			itemDef.modelZoom = 1416; 
            itemDef.name = "Sephiroths Chest Key";
            break;
            
        case 13999:
			itemDef.modelID = 44214;
			itemDef.modelZoom = 2000;
            itemDef.name = "OP Crystal";
            break;
            
            
        case 13727:
            itemDef.name = "AFK Fragments";
            break;

        case 14006:
            itemDef.modelID = 23373;
            itemDef.maleEquip1 = 23374;
            itemDef.femaleEquip1 = 23374;
            itemDef.name = "Crystal staff";
            break;
		case 19470:
            itemDef.modelID = 28379;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.modelZoom = 2000;
            itemDef.rotationX = 0;
            itemDef.modelOffsetY = -6;
            itemDef.modelOffsetX = 1;
            itemDef.maleEquip1 = 28380;
            itemDef.femaleEquip1 = 28380;
            itemDef.name = "Heated Platebody";
            break;
        case 19471:
            itemDef.modelID = 28381;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.modelZoom = 2000;
            itemDef.rotationX = 0;
            itemDef.modelOffsetY = -6;
            itemDef.modelOffsetX = 1;
            itemDef.maleEquip1 = 28382;
            itemDef.femaleEquip1 = 28382;
            itemDef.name = "Heated Platelegs";
            break;
        case 19472:
            itemDef.modelID = 28383;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.modelZoom = 800;
            itemDef.maleEquip1 = 28384;
            itemDef.femaleEquip1 = 28384;
            itemDef.name = "Heated Gloves";
            break;
        case 19473:
            itemDef.modelID = 28385;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.maleEquip1 = 28385;
            itemDef.femaleEquip1 = 28385;
            itemDef.name = "Heated Boots";
            break;
        case 19474:
            itemDef.modelID = 28386;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.modelZoom = 2000;
            itemDef.rotationX = 0;
            itemDef.modelOffsetY = -6;
            itemDef.modelOffsetX = 1;
            itemDef.maleEquip1 = 28387;
            itemDef.femaleEquip1 = 28387;
            itemDef.name = "Heated Wings";
            break;
        case 19620:
            itemDef.modelID = 28388;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.modelZoom = 2000;
            itemDef.rotationX = 0;
            itemDef.modelOffsetY = -6;
            itemDef.modelOffsetX = 1;
            itemDef.maleEquip1 = 28389;
            itemDef.femaleEquip1 = 28389;
            itemDef.name = "Dagger of Trinity";
            break;
            
        case 19714:
            itemDef.modelID = 23074;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.modelZoom = 2000;
            itemDef.rotationX = 0;
            itemDef.modelOffsetY = -6;
            itemDef.modelOffsetX = 1;
            itemDef.maleEquip1 = 23075;
            itemDef.femaleEquip1 = 23075;
            itemDef.name = "Solace Helmet";
            break;   
            case 19715:
                itemDef.modelID = 23076;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 2000;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23077;
                itemDef.femaleEquip1 = 23077;
                itemDef.name = "Solace Platebody";
                break;
                
            case 19716:
                itemDef.modelID = 23078;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 2000;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23079;
                itemDef.femaleEquip1 = 23079;
                itemDef.name = "Solace Platelegs";
                break;
                
                
            case 924:
                itemDef.modelID = 23371;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 2000;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23370;
                itemDef.femaleEquip1 = 23370;
    			changeTexture(id, 70, 70);
                itemDef.name = "Toxic Platelegs";
                break;
                
            case 19717:
                itemDef.modelID = 23080;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 2000;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23081;
                itemDef.femaleEquip1 = 23081;
                itemDef.name = "Solace Gloves";
                break;
            case 19718:
                itemDef.modelID = 23082;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 2000;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23082;
                itemDef.femaleEquip1 = 23082;
                itemDef.name = "Solace Boots";
                break;
                
            case 3082:
                itemDef.name = "Jokers Bow";
                break;
                
            case 19719:
                itemDef.modelID = 23083;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 2000;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23084;
                itemDef.femaleEquip1 = 23084;
                itemDef.name = "Solace Cape";
                break;
                
            case 19153:
                itemDef.modelID = 23427;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 2000;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23428;
                itemDef.femaleEquip1 = 23428;
                itemDef.name = "Vorago's Cape";
                break;
                
                

    		case 9481:
    			itemDef.name = "Perfect cell helm";
    			itemDef.modelID = 23809;
    			itemDef.maleEquip1 = 23810;
    			itemDef.femaleEquip1 = 23810;
    			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
    			itemDef.stackable = false;
    			break;
    			
    		case 9482:
    			itemDef.name = "Perfect cell body";
    			itemDef.modelID = 23811;
    			itemDef.maleEquip1 = 23812;
    			itemDef.femaleEquip1 = 23812;
    			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
    			itemDef.stackable = false;
    			break;
    			
    			
    		case 9483:
    			itemDef.name = "Perfect cell legs";
    			itemDef.modelID = 23813;
    			itemDef.maleEquip1 = 23814;
    			itemDef.femaleEquip1 = 23814;
    			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
    			itemDef.stackable = false;
    			break;
    			
    			
    			
    		case 9484:
    			itemDef.name = "Kid Buu Helm";
    			itemDef.modelID = 23816;
    			itemDef.maleEquip1 = 23817;
    			itemDef.femaleEquip1 = 23817;
    			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
    			itemDef.stackable = false;
    			break;
    			
    			
    		case 9485:
    			itemDef.name = "Kid Buu Body";
    			itemDef.modelID = 23818;
    			itemDef.maleEquip1 = 23819;
    			itemDef.femaleEquip1 = 23819;
    			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
    			itemDef.stackable = false;
    			break;
    			
    			
    		case 9486:
    			itemDef.name = "Kid Buu Legs";
    			itemDef.modelID = 23820;
    			itemDef.maleEquip1 = 23821;
    			itemDef.femaleEquip1 = 23821;
    			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
    			itemDef.stackable = false;
    			break;
                
    		case 16579:
    			itemDef.name = "Pet Kid Buu";
                itemDef.modelID = 23803;
                itemDef.modelZoom = 2750;
                itemDef.rotationY = 340;
                itemDef.rotationX = 0;
    			itemDef.groundActions = new String[] { null, null, "Take", null, null };
    			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
    			break;
    			
    			
    			
    			
    		case 4279:
    			itemDef.name = "OP God Shield";
    			ItemDef itemdef7 = ItemDef.forID(6524);
    			itemDef.modelID = 44310;
    			itemDef.femaleEquip1 = 44311;
    			itemDef.maleEquip1 = 44311;
    			itemDef.modelOffset1 = itemdef7.modelOffset1;
    			itemDef.modelOffsetX = itemdef7.modelOffsetX;
    			itemDef.modelOffsetY = itemdef7.modelOffsetY;
    			itemDef.modelZoom = itemdef7.modelZoom;
    			itemDef.rotationX = itemdef7.rotationX;
    			itemDef.rotationY = itemdef7.rotationY;
    			itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear";
    			itemDef.actions[2] = "Dissolve";
                itemDef.actions[4] = "Drop";	
    			break;
    			
    		case 15497:
    			itemDef.name = "Imbued Slayer Helmet";
				break;

    		case 6484:
    			itemDef.name = "Pet Scrooge Mcduck";
                itemDef.modelID = 40025;
                itemDef.modelZoom = 2750;
                itemDef.rotationY = 340;
                itemDef.rotationX = 0;
    			itemDef.groundActions = new String[] { null, null, "Take", null, null };
    			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
    			break;
    			
    		case 16580:
    			itemDef.name = "Pet Perfect Cell";
                itemDef.modelID = 23804;
                itemDef.modelZoom = 2750;
                itemDef.rotationY = 340;
                itemDef.rotationX = 0;
    			itemDef.groundActions = new String[] { null, null, "Take", null, null };
    			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
    			break;
    			
    		case 9487:
    			itemDef.name = "Freiza Helm";
    			itemDef.modelID = 23822;
    			itemDef.maleEquip1 = 23823;
    			itemDef.femaleEquip1 = 23823;
    			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
    			itemDef.stackable = false;
    			break;
    			
    			
    		case 9488:
    			itemDef.name = "Freiza  Body";
    			itemDef.modelID = 23824;
    			itemDef.maleEquip1 = 23825;
    			itemDef.femaleEquip1 = 23825;
    			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
    			itemDef.stackable = false;
    			break;
    			
    			
    		case 9489:
    			itemDef.name = "Freiza  Legs";
    			itemDef.modelID = 23826;
    			itemDef.maleEquip1 = 23827;
    			itemDef.femaleEquip1 = 23827;
    			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
    			itemDef.stackable = false;
    			break;
    			
    		case 9490:
    			itemDef.name = "Freiza Gloves";
    			itemDef.modelID = 23828;
    			itemDef.maleEquip1 = 23829;
    			itemDef.femaleEquip1 = 23829;
    			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
    			itemDef.stackable = false;
    			break;
    			
    		case 9491:
    			itemDef.name = "Freiza Boots";
    			itemDef.modelID = 23830;
    			itemDef.maleEquip1 = 23830;
    			itemDef.femaleEquip1 = 23830;
    			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
    			itemDef.stackable = false;
    			break;
    			
    		case 9492:
    			itemDef.name = "Herbal Bow";
    			itemDef.modelID = 23831;
    			itemDef.maleEquip1 = 23832;
    			itemDef.femaleEquip1 = 23832;
    			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
    			itemDef.stackable = false;
    			break;

			case 5000:
				itemDef.name = "Ice-Cold Bow";
				itemDef.modelID = 43978;
				itemDef.maleEquip1 = 43977;
				itemDef.femaleEquip1 = 43977;
				itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
				itemDef.stackable = false;
				break;
    			
    		case 13201:
    			itemDef.name = "Supreme Herbal Bow";
    			itemDef.modelID = 40238;
    			itemDef.maleEquip1 = 40239;
    			itemDef.femaleEquip1 = 40239;
    			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
    			itemDef.stackable = false;
    			break;
    			
    		case 13091:
    			itemDef.name = "Herbal Ammo";
    			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
    			itemDef.stackable = true;
    			break;
    		case 11148:
    			itemDef.name = "Cronus Helmet";
    			itemDef.modelID = 40277;
    			itemDef.maleEquip1 = 40278;
    			itemDef.femaleEquip1 = 40278;
    			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
    			itemDef.stackable = false;
    			break;
    		case 11149:
    			itemDef.name = "Cronus Platebody";
    			itemDef.modelID = 40279;
    			itemDef.maleEquip1 = 40280;
    			itemDef.femaleEquip1 = 40280;
    			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
    			itemDef.stackable = false;
    			break;
    			
    		case 11150:
    			itemDef.name = "Cronus Platelegs";
    			itemDef.modelID = 40281;
    			itemDef.maleEquip1 = 40282;
    			itemDef.femaleEquip1 = 40282;
    			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
    			itemDef.stackable = false;
    			break;
    			
    		case 11160:
    			itemDef.name = "Cronus Gloves";
    			itemDef.modelID = 40283;
    			itemDef.maleEquip1 = 40283;
    			itemDef.femaleEquip1 = 40283;
    			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
    			itemDef.stackable = false;
    			break;
    			
    		case 11161:
    			itemDef.name = "Cronus Boots";
    			itemDef.modelID = 40284;
    			itemDef.maleEquip1 = 40284;
    			itemDef.femaleEquip1 = 40284;
    			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
    			itemDef.stackable = false;
    			break;

    		case 11143:
    			itemDef.name = "Apollo Helmet";
    			itemDef.modelID = 40268;
    			itemDef.maleEquip1 = 40269;
    			itemDef.femaleEquip1 = 40269;
    			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
    			itemDef.stackable = false;
    			break;
    		case 11144:
    			itemDef.name = "Apollo Platebody";
    			itemDef.modelID = 40270;
    			itemDef.maleEquip1 = 40271;
    			itemDef.femaleEquip1 = 40271;
    			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
    			itemDef.stackable = false;
    			break;
    			
    		case 11145:
    			itemDef.name = "Apollo Platelegs";
    			itemDef.modelID = 40272;
    			itemDef.maleEquip1 = 40273;
    			itemDef.femaleEquip1 = 40273;
    			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
    			itemDef.stackable = false;
    			break;
    			
    		case 11146:
    			itemDef.name = "Apollo Gloves";
    			itemDef.modelID = 40274;
    			itemDef.maleEquip1 = 40275;
    			itemDef.femaleEquip1 = 40275;
    			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
    			itemDef.stackable = false;
    			break;
    			
    		case 11147:
    			itemDef.name = "Apollo Boots";
    			itemDef.modelID = 40276;
    			itemDef.maleEquip1 = 40276;
    			itemDef.femaleEquip1 = 40276;
    			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
    			itemDef.stackable = false;
    			break;
    			
    			
    			
    		case 9493:
    			itemDef.name = "Herbal Helm";
    			itemDef.modelID = 23833;
    			itemDef.maleEquip1 = 23834;
    			itemDef.femaleEquip1 = 23834;
    			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
    			itemDef.stackable = false;
    			break;
    			
    		case 9494:
    			itemDef.name = "Herbal Body";
    			itemDef.modelID = 23835;
    			itemDef.maleEquip1 = 23836;
    			itemDef.femaleEquip1 = 23836;
    			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
    			itemDef.stackable = false;
    			break;
    			
    		case 9495:
    			itemDef.name = "Herbal Legs";
    			itemDef.modelID = 23837;
    			itemDef.maleEquip1 = 23838;
    			itemDef.femaleEquip1 = 23838;
    			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
    			itemDef.stackable = false;
    			break;
                
            case 3874:
                itemDef.name = "Icy Skeleton Mask";
                itemDef.modelID = 40205;
                itemDef.maleEquip1 = 40200;
                itemDef.femaleEquip1 = 40200;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear";
                itemDef.stackable = false;
                break;
                
            case 3875:
                itemDef.name = "Icy Skeleton Body";
                itemDef.modelID = 40201;
                itemDef.maleEquip1 = 40202;
                itemDef.femaleEquip1 = 40202;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear";
                itemDef.stackable = false;
                break;
                
            case 3876:
                itemDef.name = "Icy Skeleton Legs";
                itemDef.modelID = 40203;
                itemDef.maleEquip1 = 40204;
                itemDef.femaleEquip1 = 40204;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear";
                itemDef.stackable = false;
                break;
    			
    			
    		case 16584:
    			itemDef.name = "Frieza Pet (second form)";
                itemDef.modelID = 23806;
                itemDef.modelZoom = 2750;
                itemDef.rotationY = 340;
                itemDef.rotationX = 0;
    			itemDef.groundActions = new String[] { null, null, "Take", null, null };
    			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
    			break;
    			
    		case 16583:
    			itemDef.name = "Frieza Pet (final form)";
                itemDef.modelID = 23807;
                itemDef.modelZoom = 2750;
                itemDef.rotationY = 340;
                itemDef.rotationX = 0;
    			itemDef.groundActions = new String[] { null, null, "Take", null, null };
    			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
    			break;
    			
    		case 16581:
    			itemDef.name = "Frieza Pet (first form)";
                itemDef.modelID = 23805;
                itemDef.modelZoom = 2750;
                itemDef.rotationY = 340;
                itemDef.rotationX = 0;
    			itemDef.groundActions = new String[] { null, null, "Take", null, null };
    			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
    			break;

            case 79:
                itemDef.modelID = 23176;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 1000;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23177;
                itemDef.femaleEquip1 = 23177;
                itemDef.name = "Mystery Cape";
                break;

				case 4635:
				case 3824:
				case 15374:
					itemDef.actions = new String[5];
					itemDef.actions[0] = "Open";
					itemDef.actions[1] = null;
					itemDef.actions[2] = "Open all";
				break;
                
            case 80:
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear";

                itemDef.actions[4] = "Drop";
                itemDef.modelID = 23178;
                itemDef.name = "BFG-900";
                itemDef.modelZoom = 900;
                itemDef.rotationY = 165;
                itemDef.rotationX = 99;
                itemDef.modelOffsetX = 0;
                itemDef.modelOffsetY = 0;
                itemDef.maleEquip1 = 23179;
                itemDef.femaleEquip1 = 23179; //95120
                itemDef.description = "CUSTOM BFG-900.";
                break;
                
            case 755:
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear";

                itemDef.actions[4] = "Drop";
                itemDef.modelID = 23178;
                itemDef.name = "BFG-900";
                itemDef.modelZoom = 900;
                itemDef.rotationY = 165;
                itemDef.rotationX = 99;
                itemDef.modelOffsetX = 0;
                itemDef.modelOffsetY = 0;
                itemDef.maleEquip1 = 23179;
                itemDef.femaleEquip1 = 23179;
                itemDef.description = "CUSTOM BFG-900 OH.";
                break;

			case 11617:
				itemDef.name = "Demonic cape";
                break;

            case 19469:
                itemDef.modelID = 99892;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 2000;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 99891;
                itemDef.femaleEquip1 = 99891;
                itemDef.name = "Trimmed Darklord Cape";
                break;
                
            case 19720:
                itemDef.modelID = 23085;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 2000;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23086;
                itemDef.femaleEquip1 = 23086;
    			itemDef.editedModelColor = new int[] { 73 };//old
    			itemDef.newModelColor = new int[] {68 };//new
                itemDef.name = "Staff of Valor";
                break;
                
            case 15649:
                itemDef.modelID = 90700;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.maleEquip1 = 90701;
                itemDef.femaleEquip1 = 90701;
                itemDef.name = "Dzanth's Hood";
                break;
                
            case 15653:
                itemDef.modelID = 94628;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.maleEquip1 = 94629;
                itemDef.femaleEquip1 = 94629;
                itemDef.name = "Dzanth's Trident";
                break;
                
            case 15650:
                itemDef.modelID = 90702;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.maleEquip1 = 90703;
                itemDef.femaleEquip1 = 90703;
                itemDef.name = "Dzanth's Robe top";
                break;
                
            case 15651:
                itemDef.modelID = 90730;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.maleEquip1 = 90731;
                itemDef.femaleEquip1 = 90731;
                itemDef.name = "Dzanth's Robe bottoms";
                break;
                
            case 15652:
                itemDef.modelID = 83392;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 2000;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 83393;
                itemDef.femaleEquip1 = 83393;
                itemDef.name = "Dzanth's Mythical Cape";
                break;
                
            case 19721:
                itemDef.modelID = 23187;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 800;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23188;
                itemDef.femaleEquip1 = 23188;
                itemDef.name = "Blessed Hood";
                break;
            case 19722:
                itemDef.modelID = 23191;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 900;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23192;
                itemDef.femaleEquip1 = 23192;
                itemDef.name = "Blessed Platebody";
                break;
                
            case 16430:
                itemDef.modelID = 23341;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 900;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
    			itemDef.originalModelColors = new int[] { 40};
    			itemDef.newModelColor = new int[] { 71 };
                itemDef.maleEquip1 = 23342;
                itemDef.femaleEquip1 = 23342;
                itemDef.name = "Blessed Kiteshield";
                break;
                
            case 19723:
                itemDef.modelID = 23189;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 900;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23190;
                itemDef.femaleEquip1 = 23190;
                itemDef.name = "Blessed Platelegs";
                break;

            case 15493:
                itemDef.modelID = 23301;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 1750;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23302;
                itemDef.femaleEquip1 = 23302;
                itemDef.name = "Athos Helmet";
                break;
            case 15494:
                itemDef.modelID = 23303;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 1750;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23304;
                itemDef.femaleEquip1 = 23304;
                itemDef.name = "Athos Platebody";
                break;
                
            case 15495:
                itemDef.modelID = 23305;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 1750;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23306;
                itemDef.femaleEquip1 = 23306;
                itemDef.name = "Athos Platelegs";
                break;
                
            case 19724:
                itemDef.modelID = 23093;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 800;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23093;
                itemDef.femaleEquip1 = 23093;
                itemDef.name = "Blessed Gloves";
                break;
                
            case 19725:
                itemDef.modelID = 23095;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 800;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23095;
                itemDef.femaleEquip1 = 23095;
                itemDef.name = "Blessed Boots";
                break;
                
                
                
            case 8664:
                itemDef.modelID = 23096;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 2000;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23097;
                itemDef.femaleEquip1 = 23097;
                itemDef.name = "Exotic Staff";
    			itemDef.originalModelColors = new int[] { 56};
    			itemDef.newModelColor = new int[] { 62 };
                break;
                
            case 8665:
                itemDef.modelID = 40029;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 2000;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 40027;
                itemDef.femaleEquip1 = 40027;
                itemDef.name = "Exotic Wings";
    			itemDef.originalModelColors = new int[] { 56};
    			itemDef.newModelColor = new int[] { 62 };
                break;
                
                
            case 8666:
                itemDef.modelID = 23098;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 1200;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23098;
                itemDef.femaleEquip1 = 23098;
    			itemDef.originalModelColors = new int[] { 56};
    			itemDef.newModelColor = new int[] { 62 };
                itemDef.name = "Exotic Boots";
                break;
                
            case 8667:
                itemDef.modelID = 23099;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 1200;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23100;
                itemDef.femaleEquip1 = 23100;
    			itemDef.originalModelColors = new int[] { 56};
    			itemDef.newModelColor = new int[] { 62 };
                itemDef.name = "Exotic Gloves";
                break;
            case 8668:
                itemDef.modelID = 23101;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 1200;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23102;
                itemDef.femaleEquip1 = 23102;
    			itemDef.originalModelColors = new int[] { 56};
    			itemDef.newModelColor = new int[] { 62 };
                itemDef.name = "Exotic Helmet";
                break;
                
            case 8669:
                itemDef.modelID = 23103;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 2000;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23104;
                itemDef.femaleEquip1 = 23104;
    			itemDef.originalModelColors = new int[] { 56};
    			itemDef.newModelColor = new int[] { 62 };
                itemDef.name = "Exotic Platelegs";
                break;
                
            case 8670:
                itemDef.modelID = 23105;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 2000;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23106;
                itemDef.femaleEquip1 = 23106;
    			itemDef.originalModelColors = new int[] { 56};
    			itemDef.newModelColor = new int[] { 62 };
                itemDef.name = "Exotic Platebody";
                break;
                
                
            case 19727:
                itemDef.modelID = 23096;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 2000;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23097;
                itemDef.femaleEquip1 = 23097;
                itemDef.name = "Supreme Staff";
    			itemDef.originalModelColors = new int[] { 56};
    			itemDef.newModelColor = new int[] { 59 };
                break;
                
            case 6485:
                itemDef.modelID = 40029;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
				itemDef.modelZoom = 2012;
				itemDef.rotationY = 307;
				itemDef.rotationX = 978;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 40027;
                itemDef.femaleEquip1 = 40027;
                itemDef.name = "Supreme Wings";
    			itemDef.originalModelColors = new int[] { 56};
    			itemDef.newModelColor = new int[] { 59 };
                break;
                
    		case 12542:
    			itemDef.name = "Abbadon Pet (X2 Damage)";
                itemDef.modelID = 91780;
                itemDef.modelZoom = 2750;
                itemDef.rotationY = 340;
                itemDef.rotationX = 0;
    			itemDef.groundActions = new String[] { null, null, "Take", null, null };
    			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
    			break;
                
    		case 6486:
    			itemDef.name = "Pet Baby Yoda";
                itemDef.modelID = 40028;
                itemDef.modelZoom = 2750;
                itemDef.rotationY = 340;
                itemDef.rotationX = 0;
    			itemDef.groundActions = new String[] { null, null, "Take", null, null };
    			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
    			break;
                
            case 19728:
                itemDef.modelID = 23098;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 1200;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23098;
                itemDef.femaleEquip1 = 23098;
    			itemDef.originalModelColors = new int[] { 56};
    			itemDef.newModelColor = new int[] { 59 };
                itemDef.name = "Supreme Boots";
                break;
                
            case 19729:
                itemDef.modelID = 23099;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 1200;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23100;
                itemDef.femaleEquip1 = 23100;
    			itemDef.originalModelColors = new int[] { 56};
    			itemDef.newModelColor = new int[] { 59 };
                itemDef.name = "Supreme Gloves";
                break;
            case 19730:
                itemDef.modelID = 23101;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 1200;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23102;
                itemDef.femaleEquip1 = 23102;
    			itemDef.originalModelColors = new int[] { 56};
    			itemDef.newModelColor = new int[] { 59 };
                itemDef.name = "Supreme Helmet";
                break;
                
            case 19731:
                itemDef.modelID = 23103;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 2000;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23104;
                itemDef.femaleEquip1 = 23104;
    			itemDef.originalModelColors = new int[] { 56};
    			itemDef.newModelColor = new int[] { 59 };
                itemDef.name = "Supreme Platelegs";
                break;
                
            case 19732:
                itemDef.modelID = 23105;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 2000;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23106;
                itemDef.femaleEquip1 = 23106;
    			itemDef.originalModelColors = new int[] { 56};
    			itemDef.newModelColor = new int[] { 59 };
                itemDef.name = "Supreme Platebody";
                break;
                
            case 19733:
                itemDef.modelID = 23108;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 2000;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23109;
                itemDef.femaleEquip1 = 23109;
                itemDef.name = "Galvan Platebody";
                break;
            case 19734:
                itemDef.modelID = 23110;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 2000;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23110;
                itemDef.femaleEquip1 = 23110;
                itemDef.name = "Blessed Boots";
                break;
                
            case 15418:
                itemDef.name = "Blessed Amulet";
                break;
                
            case 15398:
                itemDef.name = "Blessed Ring";
                break;
                
            case 19736:
                itemDef.modelID = 23111;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 2000;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23112;
                itemDef.femaleEquip1 = 23112;
                itemDef.name = "Blessed Gloves";
                break;
                
            case 19735:
                itemDef.modelID = 23113;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 2000;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23114;
                itemDef.femaleEquip1 = 23114;
                itemDef.name = "Galvan Helmet";
                break;
                
            case 19737:
                itemDef.modelID = 23115;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 2000;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23116;
                itemDef.femaleEquip1 = 23116;
                itemDef.name = "Galvan Platelegs";
                break;
                
                
            case 3821:
                itemDef.name = "Lucid Platebody";
                break;
                
            case 3822:
                itemDef.name = "Lucid Platelegs";
                break;
                

                
            case 19691:
                itemDef.modelID = 28390;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 900;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 28391;
                itemDef.femaleEquip1 = 28391;
                itemDef.name = "Trinity Helmet";
                break;   
                
            case 18396:
                itemDef.modelID = 23171;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wield";
                itemDef.modelZoom = 1000;
                itemDef.rotationX = 0;
                itemDef.modelOffsetY = -6;
                itemDef.modelOffsetX = 1;
                itemDef.maleEquip1 = 23172;
                itemDef.femaleEquip1 = 23172;
                itemDef.name = "Paradox Helmet";
                break;  
                
                case 19692:
                    itemDef.modelID = 28392;
                    itemDef.actions = new String[5];
                    itemDef.actions[1] = "Wield";
                    itemDef.modelZoom = 2000;
                    itemDef.rotationX = 0;
                    itemDef.modelOffsetY = -6;
                    itemDef.modelOffsetX = 1;
                    itemDef.maleEquip1 = 28393;
                    itemDef.femaleEquip1 = 28393;
                    itemDef.name = "Trinity Platebody";
                    break;
                    
                case 19693:
                    itemDef.modelID = 28394;
                    itemDef.actions = new String[5];
                    itemDef.actions[1] = "Wield";
                    itemDef.modelZoom = 1000;
                    itemDef.rotationX = 0;
                    itemDef.modelOffsetY = -6;
                    itemDef.modelOffsetX = 1;
                    itemDef.maleEquip1 = 28395;
                    itemDef.femaleEquip1 = 28395;
                    itemDef.name = "Trinity Platelegs";
                    break;
                    
                    
                case 19694:
                    itemDef.modelID = 28396;
                    itemDef.actions = new String[5];
                    itemDef.actions[1] = "Wield";
                    itemDef.modelZoom = 2000;
                    itemDef.maleEquip1 = 28397;
                    itemDef.femaleEquip1 = 28397;
                    itemDef.name = "Trinity Gloves";
                    break;
                case 19695:
                    itemDef.modelID = 28398;
                    itemDef.modelZoom = 2000;
                    itemDef.rotationX = 10;
                    itemDef.rotationY = 20;
                    itemDef.actions = new String[5];
                    itemDef.actions[1] = "Wield";
                    itemDef.maleEquip1 = 28398;
                    itemDef.femaleEquip1 = 28398;
                    itemDef.name = "Trinity Boots";
                    break;
                    
                case 18397:
                    itemDef.modelID = 28422;
                    itemDef.actions = new String[5];
                    itemDef.actions[1] = "Wield";
                    itemDef.modelZoom = 2000;
                    itemDef.rotationX = 0;
                    itemDef.modelOffsetY = -6;
                    itemDef.modelOffsetX = 1;
                    itemDef.maleEquip1 = 28422;
                    itemDef.femaleEquip1 = 28422;
                    itemDef.name = "Paradox Boots";
                    break;
                    
                case 19696:
                    itemDef.modelID = 28399;
                    itemDef.actions = new String[5];
                    itemDef.actions[1] = "Wield";
                    itemDef.modelZoom = 2000;
                    itemDef.rotationX = 50;
                    itemDef.rotationY = 180;
                    itemDef.modelOffsetY = -6;
                    itemDef.modelOffsetX = 1;
                    itemDef.maleEquip1 = 28400;
                    itemDef.femaleEquip1 = 28400;
                    itemDef.name = "Trinity Cape";
                    break;
                    
                case 19618:
                    itemDef.modelID = 96039;
                    itemDef.actions = new String[5];
                    itemDef.actions[1] = "Wield";
                    itemDef.modelZoom = 2000;
                    itemDef.rotationX = 0;
                    itemDef.modelOffsetY = -6;
                    itemDef.modelOffsetX = 1;
                    itemDef.maleEquip1 = 96040;
                    itemDef.femaleEquip1 = 96040;
                    itemDef.name = "Trinity Sword";
                    break;
                    
                case 19154:
                    itemDef.modelID = 23429;
                    itemDef.actions = new String[5];
                    itemDef.actions[1] = "Wield";
                    itemDef.modelZoom = 2000;
                    itemDef.rotationX = 0;
                    itemDef.modelOffsetY = -6;
                    itemDef.modelOffsetX = 1;
                    itemDef.maleEquip1 = 23429;
                    itemDef.femaleEquip1 = 23429;
                    itemDef.name = "Luminita Sword";
                    break;
                case 19713:
                    itemDef.modelID = 95068;
                    itemDef.actions = new String[5];
                    itemDef.actions[1] = "Wield";
                    itemDef.modelZoom = 2000;
                    itemDef.rotationX = 0;
                    itemDef.modelOffsetY = -6;
                    itemDef.modelOffsetX = 1;
                    itemDef.maleEquip1 = 95069;
                    itemDef.femaleEquip1 = 95069;
                    itemDef.name = "Colorful Swords";
                    break;
                    
                case 19726:
                    itemDef.modelID = 94139;
                    itemDef.actions = new String[5];
                    itemDef.actions[1] = "Wield";
                    itemDef.modelZoom = 900;
                    itemDef.rotationX = 0;
                    itemDef.modelOffsetY = -6;
                    itemDef.modelOffsetX = 1;
                    itemDef.maleEquip1 = 94139;
                    itemDef.femaleEquip1 = 94139;
                    itemDef.name = "Relentless Ring";
                    break;
                    
                case 19738:
                    itemDef.modelID = 91084;
                    itemDef.actions = new String[5];
                    itemDef.actions[1] = "Wield";
                    itemDef.modelZoom = 2000;
                    itemDef.rotationX = 0;
                    itemDef.modelOffsetY = -6;
                    itemDef.modelOffsetX = 1;
                    itemDef.maleEquip1 = 91085;
                    itemDef.femaleEquip1 = 91085;
                    itemDef.name = "Book of Secrets";
                    break;

        case 19159:
            itemDef.modelID =28355;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.modelZoom = 800;
            itemDef.rotationX = 0;
            itemDef.modelOffsetY = -6;
            itemDef.modelOffsetX = 1;
            itemDef.maleEquip1 = 28356;
            itemDef.femaleEquip1 = 28356;
            itemDef.name = "Cloud's Head";
            itemDef.stackable = false;
            break;
            
        case 19160:
            itemDef.modelID = 28357;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.modelZoom = 800;
            itemDef.rotationX = 0;
            itemDef.modelOffsetY = -6;
            itemDef.modelOffsetX = 1;
            itemDef.maleEquip1 = 28358;
            itemDef.femaleEquip1 = 28358;
            itemDef.name = "Cloud's Platebody";
            itemDef.stackable = false;
            break;
            
        case 19161:
            itemDef.modelID = 28359;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.modelZoom = 800;
            itemDef.rotationX = 0;
            itemDef.modelOffsetY = -6;
            itemDef.modelOffsetX = 1;
            itemDef.maleEquip1 = 28360;
            itemDef.femaleEquip1 = 28360;
            itemDef.name = "Cloud's Platlegs";
            itemDef.stackable = false;
            break;
        case 19163:
            itemDef.modelID = 28361;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.modelZoom = 2000;
            itemDef.rotationX = 0;
            itemDef.modelOffsetY = -6;
            itemDef.modelOffsetX = 1;
            itemDef.maleEquip1 = 28361;
            itemDef.femaleEquip1 = 28361;
            itemDef.name = "Cloud's Sword";
            itemDef.stackable = false;
            break;
            
        case 19164:
            itemDef.modelID = 28362;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.modelZoom = 2000;
            itemDef.rotationX = 0;
            itemDef.modelOffsetY = -6;
            itemDef.modelOffsetX = 1;
            itemDef.maleEquip1 = 28363;
            itemDef.femaleEquip1 = 28363;
            itemDef.name = "Cloud's cape";
            itemDef.stackable = false;
            break;
            
        case 19165:
            itemDef.modelID = 28364;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.maleEquip1 = 28365;
            itemDef.femaleEquip1 = 28365;
            itemDef.name = "Cloud's gloves";
            itemDef.stackable = false;
            break;
            
        case 19166:
            itemDef.modelID = 28366;
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.modelZoom = 800;
            itemDef.rotationX = 0;
            itemDef.modelOffsetY = -6;
            itemDef.modelOffsetX = 1;
            itemDef.maleEquip1 = 28366;
            itemDef.femaleEquip1 = 28366;
            itemDef.name = "Cloud's boots";
            itemDef.stackable = false;
            break;
            
		case 13265:
			itemDef.modelID = 40251;
			itemDef.name = "Sephiroth Sword";
			itemDef.modelZoom = 2000;
			itemDef.rotationY = 60;
			itemDef.rotationX = 30;
			itemDef.modelOffsetX = 0;
			itemDef.modelOffsetY = 5;
			itemDef.femaleEquip1 = 40252;
			itemDef.maleEquip1 = 40252;
			itemDef.description = "Sephiroth sword";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			itemDef.actions[4] = "Drop";
			break;
			
		case 18398:
			itemDef.modelID = 50065;
			itemDef.name = "Royal Scimitar";
			itemDef.modelZoom = 2000;
			itemDef.rotationY = 0;
			itemDef.rotationX = 0;
			itemDef.modelOffsetX = 0;
			itemDef.modelOffsetY = 5;
			itemDef.femaleEquip1 = 50066;
			itemDef.maleEquip1 = 50066;
			itemDef.description = "Royal Scimitar";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			itemDef.actions[4] = "Drop";
			break;
			
			
		case 923:
			itemDef.modelID = 23367;
			itemDef.name = "Blood Blade";
			itemDef.modelZoom = 2000;
			itemDef.rotationY = 0;
			itemDef.rotationX = 0;
			itemDef.modelOffsetX = 0;
			itemDef.modelOffsetY = 5;
			itemDef.femaleEquip1 = 23368;
			itemDef.maleEquip1 = 23368;
			itemDef.description = "Royal Scimitar";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			itemDef.actions[4] = "Drop";
			itemDef.originalModelColors = new int[] { 51 };
			itemDef.newModelColor = new int[] { 74 };
			break;
			
        case 1686:
			itemDef.modelID = 23489;
			
			itemDef.name = "Elemental Helm";
/*  327 */      itemDef.groundActions = new String[5];
/*  154 */       itemDef.groundActions[2] = "Take";
/*  155 */       itemDef.actions = new String[5];
/*  156 */       itemDef.actions[1] = "Wear";
			 
			 itemDef.actions[4] = "Drop";
/*  328 */       itemDef.description = "Elemental Helm";
/*  329 */       itemDef.rotationX = 119;
/*  330 */       itemDef.rotationY = 20;
/*  331 */       itemDef.modelZoom = 778;
/*  332 */       itemDef.modelOffsetX = 1;
/*  333 */       itemDef.modelOffsetY = 0;
			itemDef.maleEquip1 = 23488;
/*  152 */       itemDef.femaleEquip1 = 23488;
break;

        case 1685:
			itemDef.modelID = 23487;
			
			itemDef.name = "Elemental Platebody";
/*  327 */      itemDef.groundActions = new String[5];
/*  154 */       itemDef.groundActions[2] = "Take";
/*  155 */       itemDef.actions = new String[5];
/*  156 */       itemDef.actions[1] = "Wear";

			 itemDef.actions[4] = "Drop";
/*  328 */       itemDef.description = "Elemental Platebody";
			itemDef.maleEquip1 = 23486;
			/*  332 */       itemDef.modelOffsetX = 1;
			/*  333 */       itemDef.modelOffsetY = 200;
/*  152 */       itemDef.femaleEquip1 = 23486;
break;

        case 2544:
			itemDef.modelID = 23491;
			
			itemDef.name = "Elemental Platelegs";
/*  327 */      itemDef.groundActions = new String[5];
/*  154 */       itemDef.groundActions[2] = "Take";
/*  155 */       itemDef.actions = new String[5];
/*  156 */       itemDef.actions[1] = "Wear";

			 itemDef.actions[4] = "Drop";
/*  328 */       itemDef.description = "Elemental Platelegs";
/*  329 */       itemDef.rotationX = 119;
/*  330 */       itemDef.rotationY = 20;
/*  331 */       itemDef.modelZoom = 1665;
/*  332 */       itemDef.modelOffsetX = 7;
/*  333 */       itemDef.modelOffsetY = 5;
			itemDef.maleEquip1 = 23490;
/*  152 */       itemDef.femaleEquip1 = 23490;
break;


        case 927:
			itemDef.modelID = 23385;
			
			itemDef.name = "Starter Helm";
/*  327 */      itemDef.groundActions = new String[5];
/*  154 */       itemDef.groundActions[2] = "Take";
/*  155 */       itemDef.actions = new String[5];
/*  156 */       itemDef.actions[1] = "Wear";
			 
			 itemDef.actions[4] = "Drop";
/*  328 */       itemDef.description = "Starter Helm";
/*  329 */       itemDef.rotationX = 119;
/*  330 */       itemDef.rotationY = 20;
/*  331 */       itemDef.modelZoom = 778;
/*  332 */       itemDef.modelOffsetX = 1;
/*  333 */       itemDef.modelOffsetY = 0;
			itemDef.maleEquip1 = 23386;
/*  152 */       itemDef.femaleEquip1 = 23386;
break;

        case 928:
			itemDef.modelID = 23387;
			
			itemDef.name = "Starter Platebody";
/*  327 */      itemDef.groundActions = new String[5];
/*  154 */       itemDef.groundActions[2] = "Take";
/*  155 */       itemDef.actions = new String[5];
/*  156 */       itemDef.actions[1] = "Wear";

			 itemDef.actions[4] = "Drop";
/*  328 */       itemDef.description = "Starter Platebody";
			itemDef.maleEquip1 = 23388;
			/*  332 */       itemDef.modelOffsetX = 1;
			/*  333 */       itemDef.modelOffsetY = 200;
/*  152 */       itemDef.femaleEquip1 = 23388;
break;

        case 929:
			itemDef.modelID = 23389;
			
			itemDef.name = "Starter Platelegs";
/*  327 */      itemDef.groundActions = new String[5];
/*  154 */       itemDef.groundActions[2] = "Take";
/*  155 */       itemDef.actions = new String[5];
/*  156 */       itemDef.actions[1] = "Wear";

			 itemDef.actions[4] = "Drop";
/*  328 */       itemDef.description = "Starter Platelegs";
/*  329 */       itemDef.rotationX = 119;
/*  330 */       itemDef.rotationY = 20;
/*  331 */       itemDef.modelZoom = 1665;
/*  332 */       itemDef.modelOffsetX = 7;
/*  333 */       itemDef.modelOffsetY = 5;
			itemDef.maleEquip1 = 23390;
/*  152 */       itemDef.femaleEquip1 = 23390;
break;

			
		case 18399:
			itemDef.modelID = 48361;
			itemDef.name = "Vigour book";
			itemDef.modelZoom = 2000;
			itemDef.rotationY = 0;
			itemDef.rotationX = 0;
			itemDef.modelOffsetX = 0;
			itemDef.modelOffsetY = 5;
			itemDef.femaleEquip1 = 48362;
			itemDef.maleEquip1 = 48362;
			itemDef.description = "Vigour book";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			itemDef.actions[4] = "Drop";
			break;
			
		case 13266:
			itemDef.modelID = 40243;
			itemDef.name = "Sephiroth Hair";
			itemDef.rotationY = 0;
			itemDef.rotationX = 0;
			itemDef.modelOffsetX = 0;
			itemDef.modelOffsetY = 5;
			itemDef.femaleEquip1 = 40244;
			itemDef.maleEquip1 = 40244;
			itemDef.description = "Sephiroth Hair";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			itemDef.actions[4] = "Drop";
			break;
		case 13267:
			itemDef.modelID = 40247;
			itemDef.name = "Sephiroth Body";
			itemDef.rotationY = 0;
			itemDef.rotationX = 0;
			itemDef.modelOffsetX = 0;
			itemDef.modelOffsetY = 5;
			itemDef.femaleEquip1 = 40246;
			itemDef.maleEquip1 = 40246;
			itemDef.description = "Sephiroth body";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			itemDef.actions[4] = "Drop";
			break;
		case 13268:
			itemDef.modelID = 40240;
			itemDef.name = "Sephiroth legs";
			itemDef.rotationY = 0;
			itemDef.rotationX = 0;
			itemDef.modelOffsetX = 0;
			itemDef.modelOffsetY = 0;
			itemDef.femaleEquip1 = 40248;
			itemDef.maleEquip1 = 40248;
			itemDef.description = "Sephiroth legs";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			itemDef.actions[4] = "Drop";
			break;
			
			
			
            
		case 7682:
 			itemDef.modelID = 44313;
 			itemDef.name = "VIP Sword";
			itemDef.description = "Vip sword";
            itemDef.modelZoom = 2000;
            itemDef.rotationY = 500;
 			itemDef.modelOffset1 = -1;
 			itemDef.modelOffsetY = -1;
 			itemDef.maleEquip1 = 44314;
 			itemDef.femaleEquip1 = 44314;
 			itemDef.actions = new String[5];
 			itemDef.actions[1] = "Wear";
 			itemDef.actions[4] = "Drop";
 			break;
		case 7683:
 			itemDef.modelID = 44316;
 			itemDef.name = "VIP Gloves";
			itemDef.description = "Vip gloves";
            itemDef.modelZoom = 2000;
            itemDef.rotationY = 500;
 			itemDef.modelOffset1 = -1;
 			itemDef.modelOffsetY = -1;
 			itemDef.maleEquip1 = 44315;
 			itemDef.femaleEquip1 = 44315;
 			itemDef.actions = new String[5];
 			itemDef.actions[1] = "Wear";
 			itemDef.actions[4] = "Drop";
 			break;
			
		case 7684:
 			itemDef.modelID = 44317;
 			itemDef.name = "VIP Helmet";
			itemDef.description = "Vip Helmet";
            itemDef.modelZoom = 2000;
            itemDef.rotationY = 500;
 			itemDef.modelOffset1 = -1;
 			itemDef.modelOffsetY = -1;
 			itemDef.maleEquip1 = 44318;
 			itemDef.femaleEquip1 = 44318;
 			itemDef.actions = new String[5];
 			itemDef.actions[1] = "Wear";
 			itemDef.actions[4] = "Drop";
 			break;
			
		case 7685:
 			itemDef.modelID = 44319;
 			itemDef.name = "VIP Platelegs";
			itemDef.description = "Vip Platelegs";
            itemDef.modelZoom = 2000;
            itemDef.rotationY = 500;
 			itemDef.modelOffset1 = -1;
 			itemDef.modelOffsetY = -1;
 			itemDef.maleEquip1 = 44320;
 			itemDef.femaleEquip1 = 44320;
 			itemDef.actions = new String[5];
 			itemDef.actions[1] = "Wear";
 			itemDef.actions[4] = "Drop";
 			break;
			
		case 7686:
 			itemDef.modelID = 44326;
 			itemDef.name = "VIP Boots";
			itemDef.description = "Vip Boots";
            itemDef.modelZoom = 2000;
            itemDef.rotationY = 500;
 			itemDef.modelOffset1 = -1;
 			itemDef.modelOffsetY = -1;
 			itemDef.maleEquip1 = 44326;
 			itemDef.femaleEquip1 = 44326;
 			itemDef.actions = new String[5];
 			itemDef.actions[1] = "Wear";
 			itemDef.actions[4] = "Drop";
 			break;
		case 7687:
 			itemDef.modelID = 44324;
 			itemDef.name = "VIP Platebody";
			itemDef.description = "VIP Platebody";
            itemDef.modelZoom = 2000;
            itemDef.rotationY = 500;
 			itemDef.modelOffset1 = -1;
 			itemDef.modelOffsetY = -1;
 			itemDef.maleEquip1 = 44325;
 			itemDef.femaleEquip1 = 44325;
 			itemDef.actions = new String[5];
 			itemDef.actions[1] = "Wear";
 			itemDef.actions[4] = "Drop";
 			break;
		case 7688:
 			itemDef.modelID = 44322;
 			itemDef.name = "VIP Sword(OH)";
			itemDef.description = "VIP Sword(OH)";
            itemDef.modelZoom = 2000;
            itemDef.rotationY = 500;
 			itemDef.modelOffset1 = -1;
 			itemDef.modelOffsetY = -1;
 			itemDef.maleEquip1 = 44323;
 			itemDef.femaleEquip1 = 44323;
 			itemDef.actions = new String[5];
 			itemDef.actions[1] = "Wear";
 			itemDef.actions[4] = "Drop";
 			break;
			
 			
		case 7756:
 			itemDef.modelID = 44327;
 			itemDef.name = "Devastating Helmet";
			itemDef.description = "Devastating Helmet";
            itemDef.modelZoom = 2000;
            itemDef.rotationY = 500;
 			itemDef.modelOffset1 = -1;
 			itemDef.modelOffsetY = -1;
 			itemDef.maleEquip1 = 44328;
 			itemDef.femaleEquip1 = 44328;
 			itemDef.actions = new String[5];
 			itemDef.actions[1] = "Wear";
 			itemDef.actions[4] = "Drop";
 			break;
 			
			
		case 7757:
 			itemDef.modelID = 44329;
 			itemDef.name = "Devastating Platebody";
			itemDef.description = "Devastating Platebody";
            itemDef.modelZoom = 2000;
            itemDef.rotationY = 500;
 			itemDef.modelOffset1 = -1;
 			itemDef.modelOffsetY = -1;
 			itemDef.maleEquip1 = 44330;
 			itemDef.femaleEquip1 = 44330;
 			itemDef.actions = new String[5];
 			itemDef.actions[1] = "Wear";
 			itemDef.actions[4] = "Drop";
			itemDef.stackable = false;
 			break;
			
		case 7758:
 			itemDef.modelID = 44331;
 			itemDef.name = "Devastating Platelegs";
			itemDef.description = "Devastating Platelegs";
            itemDef.modelZoom = 2000;
            itemDef.rotationY = 500;
 			itemDef.modelOffset1 = -1;
 			itemDef.modelOffsetY = -1;
 			itemDef.maleEquip1 = 44332;
 			itemDef.femaleEquip1 = 44332;
 			itemDef.actions = new String[5];
 			itemDef.actions[1] = "Wear";
 			itemDef.actions[4] = "Drop";
 			break;
 			
		case 7759:
 			itemDef.modelID = 44333;
 			itemDef.name = "Vip Stoner helmet";
			itemDef.description = "Vip Stoner helmet";
            itemDef.modelZoom = 2000;
            itemDef.rotationY = 500;
 			itemDef.modelOffset1 = -1;
 			itemDef.modelOffsetY = -1;
 			itemDef.maleEquip1 = 44334;
 			itemDef.femaleEquip1 = 44334;
 			itemDef.actions = new String[5];
 			itemDef.actions[1] = "Wear";
 			itemDef.actions[4] = "Drop";
			itemDef.stackable = false;
 			break;
 			
		case 7760:
 			itemDef.modelID = 44335;
 			itemDef.name = "Vip Stoner platebody";
			itemDef.description = "Vip Stoner platebody";
            itemDef.modelZoom = 2000;
            itemDef.rotationY = 500;
 			itemDef.modelOffset1 = -1;
 			itemDef.modelOffsetY = -1;
 			itemDef.maleEquip1 = 44336;
 			itemDef.femaleEquip1 = 44336;
 			itemDef.actions = new String[5];
 			itemDef.actions[1] = "Wear";
 			itemDef.actions[4] = "Drop";
			 itemDef.stackable = false;
 			break;
 			
		case 7761:
 			itemDef.modelID = 44337;
 			itemDef.name = "Vip Stoner platelegs";
			itemDef.description = "Vip Stoner platelegs";
            itemDef.modelZoom = 2000;
            itemDef.rotationY = 500;
 			itemDef.modelOffset1 = -1;
 			itemDef.modelOffsetY = -1;
 			itemDef.maleEquip1 = 44338;
 			itemDef.femaleEquip1 = 44338;
 			itemDef.actions = new String[5];
 			itemDef.actions[1] = "Wear";
 			itemDef.actions[4] = "Drop";
 			break;
 			
		case 7762:
 			itemDef.modelID = 44339;
 			itemDef.name = "Vip Stoner Boots";
			itemDef.description = "Vip Stoner Boots";
            itemDef.modelZoom = 2000;
            itemDef.rotationY = 500;
 			itemDef.modelOffset1 = -1;
 			itemDef.modelOffsetY = -1;
 			itemDef.maleEquip1 = 44339;
 			itemDef.femaleEquip1 = 44339;
 			itemDef.actions = new String[5];
 			itemDef.actions[1] = "Wear";
 			itemDef.actions[4] = "Drop";
			itemDef.stackable = false;
 			break;
 			
 			
		case 7763:
 			itemDef.modelID = 44340;
 			itemDef.name = "Vip Stoner Cape";
			itemDef.description = "Vip Stoner Cape";
            itemDef.modelZoom = 2000;
            itemDef.rotationY = 500;
 			itemDef.modelOffset1 = -1;
 			itemDef.modelOffsetY = -1;
 			itemDef.maleEquip1 = 44341;
 			itemDef.femaleEquip1 = 44341;
 			itemDef.actions = new String[5];
 			itemDef.actions[1] = "Wear";
 			itemDef.actions[4] = "Drop";
			itemDef.stackable = false;
 			break;
 			
 			
		case 7764:
 			itemDef.modelID = 44342;
 			itemDef.name = "Vip Stoner Gun";
			itemDef.description = "Vip Stoner Gun";
            itemDef.modelZoom = 2000;
            itemDef.rotationY = 500;
 			itemDef.modelOffset1 = -1;
 			itemDef.modelOffsetY = -1;
 			itemDef.maleEquip1 = 44343;
 			itemDef.femaleEquip1 = 44343;
 			itemDef.actions = new String[5];
 			itemDef.actions[1] = "Wear";
 			itemDef.actions[4] = "Drop";
			itemDef.stackable = false;
 			break;
 			
		case 7765:
 			itemDef.modelID = 44344;
 			itemDef.name = "Vip Stoner Shield";
			itemDef.description = "Vip Stoner Shield";
            itemDef.modelZoom = 2000;
            itemDef.rotationY = 500;
 			itemDef.modelOffset1 = -1;
 			itemDef.modelOffsetY = -1;
 			itemDef.maleEquip1 = 44345;
 			itemDef.femaleEquip1 = 44345;
 			itemDef.actions = new String[5];
 			itemDef.actions[1] = "Wear";
 			itemDef.actions[4] = "Drop";
			itemDef.stackable = false;
 			break;
			
			
        case 13205:
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.modelID = 40253;
            itemDef.modelZoom = 1200;
            itemDef.rotationY = 500;
            itemDef.rotationX = 0;
            itemDef.modelOffsetY = -6;
            itemDef.modelOffsetX = 1;
            itemDef.maleEquip1 = 40253;
            itemDef.femaleEquip1 = 40253;
            itemDef.name = "Storm Breaker Boots";
            break;
            
		case 13207:
 			itemDef.modelID = 40262;
 			itemDef.name = "Storm Breaker Maul";
			itemDef.description = "Toxidian Maul";
            itemDef.modelZoom = 2000;
            itemDef.rotationY = 500;
 			itemDef.modelOffset1 = -1;
 			itemDef.modelOffsetY = -1;
 			itemDef.maleEquip1 = 40263;
 			itemDef.femaleEquip1 = 40263;
 			itemDef.actions = new String[5];
 			itemDef.actions[1] = "Wear";
 			itemDef.actions[4] = "Drop";
 			break;
            
        case 13206:
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.modelID = 40256;
            itemDef.modelZoom = 1000;
            itemDef.rotationY = 100;
            itemDef.rotationX = 0;
            itemDef.modelOffsetY = -6;
            itemDef.modelOffsetX = 1;
            itemDef.maleEquip1 = 40257;
            itemDef.femaleEquip1 = 40257;
            itemDef.name = "Storm Breaker Helm";
            break;
            
        case 13202:
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.modelID = 40260;
            itemDef.modelZoom = 1600;
            itemDef.rotationY = 500;
            itemDef.rotationX = 0;
            itemDef.modelOffsetY = -6;
            itemDef.modelOffsetX = 1;
            itemDef.maleEquip1 = 40261;
            itemDef.femaleEquip1 = 40261;
            itemDef.name = "Storm Breaker Body";
            break;
            
        case 13203:
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.modelID = 40258;
            itemDef.modelZoom = 1600;
            itemDef.rotationY = 500;
            itemDef.rotationX = 0;
            itemDef.modelOffsetY = -6;
            itemDef.modelOffsetX = 1;
            itemDef.maleEquip1 = 40259;
            itemDef.femaleEquip1 = 40259;
            itemDef.name = "Storm Breaker Legs";
            break;
            
        case 13204:
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wield";
            itemDef.modelID = 40254;
            itemDef.modelZoom = 1600;
            itemDef.rotationY = 500;
            itemDef.rotationX = 0;
            itemDef.modelOffsetY = -6;
            itemDef.modelOffsetX = 1;
            itemDef.maleEquip1 = 40255;
            itemDef.femaleEquip1 = 40255;
            itemDef.name = "Storm Breaker Gloves";
            break;
            
            
		case 3258:
			itemDef.modelID = 83347;
			itemDef.name = "Starter Helmet";
			itemDef.modelZoom = 2000;
			itemDef.rotationY = 0;
			itemDef.rotationX = 0;
			itemDef.modelOffsetX = 0;
			itemDef.modelOffsetY = 5;
			itemDef.femaleEquip1 = 83347;
			itemDef.maleEquip1 = 83347;
			itemDef.description = "Starter Helmet";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			itemDef.actions[4] = "Drop";
			break;
		case 3079:
			itemDef.modelID = 83350;
			itemDef.name = "Starter Body";
			itemDef.modelZoom = 2000;
			itemDef.rotationY = 0;
			itemDef.rotationX = 0;
			itemDef.modelOffsetX = 0;
			itemDef.modelOffsetY = 5;
			itemDef.femaleEquip1 = 83351;
			itemDef.maleEquip1 = 83351;
			itemDef.description = "Starter body";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			itemDef.actions[4] = "Drop";
			break;
		case 3080:
			itemDef.modelID = 83348;
			itemDef.name = "Starter legs";
			itemDef.modelZoom = 2000;
			itemDef.rotationY = 0;
			itemDef.rotationX = 0;
			itemDef.modelOffsetX = 0;
			itemDef.modelOffsetY = 5;
			itemDef.femaleEquip1 = 83349;
			itemDef.maleEquip1 = 83349;
			itemDef.description = "Starter legs";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			itemDef.actions[4] = "Drop";
			break;
		case 13269:
			itemDef.modelID = 38327;
			itemDef.name = "Sephiroth Gloves";
			itemDef.modelZoom = 2000;
			itemDef.rotationY = 0;
			itemDef.rotationX = 0;
			itemDef.modelOffsetX = 0;
			itemDef.modelOffsetY = 5;
			itemDef.femaleEquip1 = 28320;
			itemDef.maleEquip1 = 28320;
			itemDef.description = "Sephiroth Gloves";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			itemDef.actions[4] = "Drop";
			break;
			
			
		case 13258:
			itemDef.modelID = 57557;
			itemDef.name = "Toxic helmet";
			itemDef.modelZoom = 2000;
			itemDef.rotationY = 0;
			itemDef.rotationX = 0;
			itemDef.modelOffsetX = 0;
			itemDef.modelOffsetY = 5;
			itemDef.femaleEquip1 = 57558;
			itemDef.maleEquip1 = 57558;
			itemDef.description = "Sirenic helmet";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			itemDef.actions[4] = "Drop";
			break;
			
		case 18391: //TODO
			itemDef.modelID = 65269;
			itemDef.name = "iPhone";
			itemDef.femaleEquip1 = 65268;
			itemDef.maleEquip1 = 65268;
			itemDef.description = "A nice iPhone that can summon your minime.";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[2] = "Ring Minime";
			itemDef.actions[4] = "Drop";
			break;
			
		case 13256:
			itemDef.modelID = 57561;
			itemDef.name = "Sirenic legs";
			itemDef.modelZoom = 2000;
			itemDef.rotationY = 0;
			itemDef.rotationX = 0;
			itemDef.modelOffsetX = 0;
			itemDef.modelOffsetY = 5;
			itemDef.femaleEquip1 = 57562;
			itemDef.maleEquip1 = 57562;
			itemDef.description = "Sirenic legs";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			itemDef.actions[4] = "Drop";
			break;
		case 13259:
			itemDef.modelID = 57559;
			itemDef.name = "Sirenic top";
			itemDef.modelZoom = 2000;
			itemDef.rotationY = 0;
			itemDef.rotationX = 0;
			itemDef.modelOffsetX = 0;
			itemDef.modelOffsetY = 5;
			itemDef.femaleEquip1 = 57560;
			itemDef.maleEquip1 = 57560;
			itemDef.description = "Sirenic top";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			itemDef.actions[4] = "Drop";
			break;
			
		case 3260:
			itemDef.modelID = 94700;
			itemDef.name = "Sirenic Boots";
			itemDef.modelZoom = 2000;
			itemDef.rotationY = 0;
			itemDef.rotationX = 0;
			itemDef.modelOffsetX = 0;
			itemDef.modelOffsetY = 5;
			itemDef.femaleEquip1 = 94700;
			itemDef.maleEquip1 = 94700;
			itemDef.description = "Sirenic boots";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.newModelColor = new int[] { 22 };
			itemDef.actions[1] = "Equip";
			itemDef.actions[4] = "Drop";
			break;
			
			
		case 13270:
			itemDef.modelID = 40250;
			itemDef.name = "Sephiroth Boots";
			itemDef.modelZoom = 2000;
			itemDef.rotationY = 0;
			itemDef.rotationX = 0;
			itemDef.modelOffsetX = 0;
			itemDef.modelOffsetY = 5;
			itemDef.femaleEquip1 = 40250;
			itemDef.maleEquip1 = 40250;
			itemDef.description = "Starter boots";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			itemDef.actions[4] = "Drop";
			break;
			
		case 3277:
			itemDef.modelID = 23529;
			itemDef.name = "Donators Aura";
			itemDef.modelZoom = 2000;
			itemDef.rotationY = 0;
			itemDef.rotationX = 0;
			itemDef.modelOffsetX = 0;
			itemDef.modelOffsetY = 5;
			itemDef.femaleEquip1 = 23530;
			itemDef.maleEquip1 = 23530;
			itemDef.description = "Flex the donations";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			itemDef.actions[4] = "Drop";
			break;
			
			
        case 15357:
			//ItemDef.copyModel(itemDef, 15245);
            itemDef.name = "Jad WorldBoss";
            itemDef.stackable = true;
            break;

			case 15358:
				ItemDef.copyModel(itemDef, 15357);
				itemDef.name = "Assassin";
				itemDef.stackable = true;
				break;

			case 15359:
				ItemDef.copyModel(itemDef, 15357);
				itemDef.name = "Dark Ranger";
				itemDef.stackable = true;
				break;

			case 15363:
				ItemDef.copyModel(itemDef, 15357);
				itemDef.name = "Sephiroth";
				itemDef.stackable = true;
				break;

			case 15361:
				ItemDef.copyModel(itemDef, 15357);
				itemDef.name = "Rick";
				itemDef.stackable = true;
				break;

			case 15362:
				ItemDef.copyModel(itemDef, 15357);
				itemDef.name = "May";
				itemDef.stackable = true;
				break;

			case 19864:
				ItemDef.copyModel(itemDef, 15245);
				itemDef.actions[0] = "Read";
				itemDef.name = "Starter Ticket";
				itemDef.stackable = true;
				break;

        case 4789:
			itemDef.modelID = 44215;
			itemDef.modelZoom = 2000;
            itemDef.name = "Fairy Crystal";
            break;
            
        case 4790:
			itemDef.modelID = 44214;
			itemDef.modelZoom = 2000;
            itemDef.name = "Fire Crystal";
            break;
            
        case 4791:
			itemDef.modelID = 44213;
			itemDef.modelZoom = 2000;
            itemDef.name = "Water Crystal";
            break;
            
        case 4792:
			itemDef.modelID = 44212;
			itemDef.modelZoom = 2000;
            itemDef.name = "Electric Crystal";
            break;
            
		case 6500:
			ItemDef.copyModel(itemDef, 15387);
            itemDef.actions[1] = "Configure";
			itemDef.name = "Starter Looting Bag";
			break;
			
		case 1639:
			itemDef.name = "Starter ring";
			itemDef.animateInventory = true;
			break;
			
		case 9496:
			itemDef.name = "Detrimental Helm";
			itemDef.modelID = 23847;
			itemDef.maleEquip1 = 23848;
			itemDef.femaleEquip1 = 23848;
			itemDef.originalModelColors = new int[] { 52 };
			itemDef.newModelColor = new int[] { 62 };
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 9497:
			itemDef.name = "Detrimental Body";
			itemDef.modelID = 23849;
			itemDef.maleEquip1 = 23850;
			itemDef.femaleEquip1 = 23850;
			itemDef.originalModelColors = new int[] { 52 };
			itemDef.newModelColor = new int[] { 62};
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
			
		case 9498:
			itemDef.name = "Detrimental Legs";
			itemDef.modelID = 23851;
			itemDef.maleEquip1 = 23852;
			itemDef.femaleEquip1 = 23852;
			itemDef.originalModelColors = new int[] { 52 };
			itemDef.newModelColor = new int[] { 62 };
			itemDef.actions = new String[] { null, "Wear", null, null, "Drop" };
			itemDef.stackable = false;
			break;
            
			
			
		case 15037:
			itemDef.name = "Starter boots";
			itemDef.animateInventory = true;
			break;
			
		case 15118:
			ItemDef.copyModel(itemDef, 13660);
			itemDef.name = "Starter Gloves";
            itemDef.modelID = 23779;
            itemDef.maleEquip1 = 23778;
            itemDef.femaleEquip1 = 23778;
			itemDef.animateInventory = true;
			break;
			
		case 9499:
			ItemDef.copyModel(itemDef, 13660);
			itemDef.name = "Detrimental Gloves";
            itemDef.modelID = 23779;
            itemDef.maleEquip1 = 23778;
            itemDef.femaleEquip1 = 23778;
			itemDef.animateInventory = true;
			break;
			
            
        case 989:
			ItemDef.copyModel(itemDef, 1545);
            itemDef.name = "Starter keys";
            break;
            
        case 5136:
			ItemDef.copyModel(itemDef, 13723);
            itemDef.actions[0] = "Break";
            itemDef.name = "DBZ Layer 2 Teleport";
            break;
            
        case 5149:
			ItemDef.copyModel(itemDef, 579);
            itemDef.actions[0] = "Equip";
            itemDef.name = "Greywave robe top";
            break;
            
            
        case 7629:
            itemDef.actions[0] = "Read";
            itemDef.name = "PVM Tickets";
            break;

			case 19892:
				itemDef.name = "Hellfire Necklace";
				break;
            
        case 19121:
            itemDef.name = "Zamron Starter Box";
            break;
            

			
        case 4278:
			ItemDef.copyModel(itemDef, 7629);
            itemDef.actions[0] = "Read";
            itemDef.name = "PVM Tickets";
            itemDef.stackable = true;
            break;
            
        case 926:
			ItemDef.copyModel(itemDef, 4651);
			changeTexture(id, 59, 72);
            itemDef.actions[1] = "Equip";
			
            itemDef.actions[4] = "Drop";
            itemDef.name = "Toxic Cape";
			itemDef.modelZoom = 2000;
			itemDef.animateInventory = true;
            break;
            
        case 930:
			ItemDef.copyModel(itemDef, 4651);
            itemDef.actions[1] = "Equip";
			
            itemDef.actions[4] = "Drop";
            itemDef.name = "Aquatic Cape";
			changeTexture(id, 59, 71);
			itemDef.modelZoom = 2000;
			itemDef.animateInventory = true;
            break;
            
        case 931:
			ItemDef.copyModel(itemDef, 4651);
			changeTexture(id, 59, 64);
            itemDef.actions[1] = "Equip";
			
            itemDef.actions[4] = "Drop";
			itemDef.modelZoom = 2000;
            itemDef.name = "Elemental Cape";
			itemDef.animateInventory = true;
            break;
            
        case 15656:
			ItemDef.copyModel(itemDef, 3977);
            itemDef.name = "Darkblue Staff";
            break;
            
        case 19890:
            itemDef.name = "2H DDR scroll";
            break;
            
        case 20268:
			ItemDef.copyModel(itemDef, 17680);
            itemDef.name = "Infernal Ashes";
            break;
            
        case 15648:
            itemDef.name = "X10 Trivia points";
            break;
            
        case 20427:
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
            itemDef.modelID = 23174;
            itemDef.name = "BFG-900";
            itemDef.modelZoom = 1200;
            itemDef.rotationY = 165;
            itemDef.rotationX = 99;
			itemDef.modelOffsetY = 30;
			itemDef.modelOffsetX = 20;
            itemDef.maleEquip1 = 23173;
            itemDef.femaleEquip1 = 23173;
            itemDef.description = "A BFG-900.";
            break;
            
        case 20431:
            itemDef.actions = new String[5];
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
            itemDef.modelID = 23174;
            itemDef.name = "Offhand BFG-900";
            itemDef.modelZoom = 1200;
            itemDef.rotationY = 165;
            itemDef.rotationX = 99;
			itemDef.modelOffsetY = 30;
			itemDef.modelOffsetX = 20;
            itemDef.maleEquip1 = 23175;
            itemDef.femaleEquip1 = 23175;
            itemDef.description = "A Offhand BFG-900.";
            break;
            
        case 18325:
			ItemDef.copyModel(itemDef, 3087);
            itemDef.actions[0] = "Equip";
            itemDef.name = "Zamron Helmet";
			itemDef.groundActions = new String[5];
			itemDef.groundActions[2] = "Take";
			itemDef.actions = new String[5];
			itemDef.actions[1] = "Equip";
			itemDef.actions[4] = "Drop";
			break;
            
        case 13275:
            itemDef.modelID = 23777;
            itemDef.stackable = false;
            itemDef.name = "Goku Boots";
            itemDef.description = "Looking good";
            itemDef.stackable = false;
            itemDef.maleEquip1 = 23777;
            itemDef.femaleEquip1 = 23777;
            itemDef.actions = new String[5];
            itemDef.modelZoom = 800;
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
            break;
          
          case 13271:
            itemDef.modelID = 23779;
            itemDef.stackable = false;
            itemDef.name = "Goku Gloves";
            itemDef.description = "Looking good";
            itemDef.stackable = false;
            itemDef.maleEquip1 = 23778;
            itemDef.femaleEquip1 = 23778;
            itemDef.actions = new String[5];
            itemDef.modelZoom = 800;
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
            break;
          
          case 13272:
            itemDef.modelID = 23781;
            itemDef.name = "Goku Hair";
            itemDef.description = "Looking good";
            itemDef.stackable = false;
            itemDef.maleEquip1 = 23780;
            itemDef.femaleEquip1 = 23780;
            itemDef.actions = new String[5];
            itemDef.modelZoom = 1322;
            itemDef.rotationY = 520;
            itemDef.rotationX = 0;
            itemDef.modelOffset1 = -1;
            itemDef.modelOffsetY = 5;
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
            break;
          
          case 13273:
            itemDef.modelID = 23783;
            itemDef.stackable = false;
            itemDef.name = "Goku Legs";
            itemDef.description = "Looking good";
            itemDef.maleEquip1 = 23782;
            itemDef.femaleEquip1 = 23782;
            itemDef.actions = new String[5];
            itemDef.modelZoom = 1322;
            itemDef.rotationY = 520;
            itemDef.rotationX = 0;
            itemDef.modelOffset1 = -1;
            itemDef.modelOffsetY = 5;
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
            break;
          
          case 13274:
            itemDef.modelID = 23785;
            itemDef.name = "Goku Body";
            itemDef.description = "Looking good";
            itemDef.maleEquip1 = 23820;
            itemDef.femaleEquip1 = 23820;
            itemDef.stackable = false;
            itemDef.actions = new String[5];
            itemDef.modelZoom = 1322;
            itemDef.rotationY = 520;
            itemDef.rotationX = 0;
            itemDef.modelOffset1 = -1;
            itemDef.modelOffsetY = 5;
            itemDef.actions[1] = "Wear";
            itemDef.actions[4] = "Drop";
            break;
            
            
            
          case 13594:
              itemDef.modelID = 23786;
              itemDef.stackable = false;
              itemDef.name = "Vegeta Armor Boots";
              itemDef.description = "Looking good";
              itemDef.maleEquip1 = 23786;
              itemDef.femaleEquip1 = 23786;
              itemDef.actions = new String[5];
              itemDef.modelZoom = 800;
              itemDef.actions[1] = "Wear";
              itemDef.actions[4] = "Drop";
              break;
            case 13595:
              itemDef.modelID = 23788;
              itemDef.stackable = false;
              itemDef.name = "Vegeta Armor Gloves";
              itemDef.description = "Looking good";
              itemDef.maleEquip1 = 23787;
              itemDef.femaleEquip1 = 23787;
              itemDef.actions = new String[5];
              itemDef.modelZoom = 800;
              itemDef.actions[1] = "Wear";
              itemDef.actions[4] = "Drop";
              break;
            
            case 13596:
              itemDef.modelID = 23790;
              itemDef.stackable = false;
              itemDef.name = "Vegeta Hair";
              itemDef.description = "Looking good";
              itemDef.maleEquip1 = 23789;
              itemDef.femaleEquip1 = 23789;
              itemDef.actions = new String[5];
              itemDef.modelZoom = 1322;
              itemDef.rotationY = 520;
              itemDef.rotationX = 0;
              itemDef.modelOffset1 = -1;
              itemDef.modelOffsetY = 5;
              itemDef.actions[1] = "Wear";
              itemDef.actions[4] = "Drop";
              break;
            
            case 13597:
              itemDef.modelID = 23792;
              itemDef.name = "Vegeta Armor Legs";
              itemDef.description = "Looking good";
              itemDef.stackable = false;
              itemDef.maleEquip1 = 23791;
              itemDef.femaleEquip1 = 23791;
              itemDef.actions = new String[5];
              itemDef.modelZoom = 1322;
              itemDef.rotationY = 520;
              itemDef.rotationX = 0;
              itemDef.modelOffset1 = -1;
              itemDef.modelOffsetY = 5;
              itemDef.actions[1] = "Wear";
              itemDef.actions[4] = "Drop";
              break;
            
            case 13664:
              itemDef.modelID = 23794;
              itemDef.name = "Vegeta Body Armor";
              itemDef.description = "Looking good";
              itemDef.stackable = false;
              itemDef.maleEquip1 = 23793;
              itemDef.femaleEquip1 = 23793;
              itemDef.actions = new String[5];
              itemDef.modelZoom = 1322;
              itemDef.rotationY = 520;
              itemDef.rotationX = 0;
              itemDef.modelOffset1 = -1;
              itemDef.modelOffsetY = 5;
              itemDef.actions[1] = "Wear";
              itemDef.actions[4] = "Drop";
              break;
              
            case 18380:
                itemDef.modelID = 80518;
                itemDef.name = "Blazed Helmet";
                itemDef.description = "might be hot!";
                itemDef.stackable = false;
                itemDef.maleEquip1 = 80519;
                itemDef.femaleEquip1 = 80519;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear";
                itemDef.actions[4] = "Drop";
                break;
                
            case 18381:
                itemDef.modelID = 80520;
                itemDef.name = "Blazed Chestplate";
                itemDef.description = "might be hot!";
                itemDef.stackable = false;
                itemDef.maleEquip1 = 80521;
                itemDef.femaleEquip1 = 80521;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear";
                itemDef.actions[4] = "Drop";
                break;
                
            case 18382:
                itemDef.modelID = 80522;
                itemDef.name = "Blazed Platelegs";
                itemDef.description = "might be hot!";
                itemDef.stackable = false;
                itemDef.maleEquip1 = 80523;
                itemDef.femaleEquip1 = 80523;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear";
                itemDef.actions[4] = "Drop";
                break;
                
            case 18383:
                itemDef.modelID = 80524;
                itemDef.name = "Blazed Boots";
                itemDef.description = "might be hot!";
                itemDef.stackable = false;
                itemDef.maleEquip1 = 80524;
                itemDef.femaleEquip1 = 80524;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear";
                itemDef.actions[4] = "Drop";
                break;
                
            case 18384:
                itemDef.modelID = 80525;
                itemDef.name = "Blazed Wings";
                itemDef.description = "might be hot!";
                itemDef.stackable = false;
                itemDef.maleEquip1 = 80526;
                itemDef.femaleEquip1 = 80526;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear";
                itemDef.actions[4] = "Drop";
                break;
                
            case 18402:
                itemDef.modelID = 80525;
                itemDef.name = "Blazed Wings(3%DR)";
                itemDef.description = "might be hot!";
                itemDef.stackable = false;
                itemDef.maleEquip1 = 80526;
                itemDef.femaleEquip1 = 80526;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear";
                itemDef.actions[4] = "Drop";
                break;
                
            case 18385:
                itemDef.modelID = 80527;
                itemDef.name = "Blazed Scimitar";
                itemDef.description = "might be hot!";
                itemDef.stackable = false;
                itemDef.maleEquip1 = 80528;
                itemDef.femaleEquip1 = 80528;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear";
                itemDef.actions[4] = "Drop";
                break;
              
            case 18379:
                itemDef.modelID = 80007;
                itemDef.name = "Blazed Shield";
                itemDef.description = "Looking good";
                itemDef.stackable = false;
                itemDef.maleEquip1 = 80007;
                itemDef.femaleEquip1 = 80007;
                itemDef.actions = new String[5];
                itemDef.actions[1] = "Wear";
                itemDef.actions[4] = "Drop";
                break;
			
            case 13665:
                itemDef.modelID = 23794;
                itemDef.name = "Dream Boots";
                itemDef.description = "Looking good";
                itemDef.stackable = false;
                itemDef.maleEquip1 = 23793;
                itemDef.femaleEquip1 = 23793;
                itemDef.actions = new String[5];
                itemDef.modelZoom = 1322;
                itemDef.rotationY = 520;
                itemDef.rotationX = 0;
                itemDef.modelOffset1 = -1;
                itemDef.modelOffsetY = 5;
                itemDef.actions[1] = "Wear";
                itemDef.actions[4] = "Drop";
                break;
              
		case 5137:
			ItemDef.copyModel(itemDef, 10340);
			itemDef.name = "Dragon-age Robe top";
			break;
			
		case 1837:
			itemDef.name = "OP Boots";
			break;
			
		case 3060:
			itemDef.name = "OP Gloves";
			break;
			
		case 9470:
			itemDef.name = "OP Scarf";
			break;

		case 5138:
			ItemDef.copyModel(itemDef, 10338);
			itemDef.name = "Dragon-age Magic robe bottom";
			break;

		case 3956:
			ItemDef.copyModel(itemDef, 3974);
			itemDef.name = "Hellfire Wings";
			itemDef.originalModelColors = new int[] { 40 };
			itemDef.newModelColor = new int[] { 59 };
			break;
			
		case 922:
			ItemDef.copyModel(itemDef, 3974);
			itemDef.name = "Sirenic Wings";
			itemDef.originalModelColors = new int[] { 59 };
			itemDef.newModelColor = new int[] { 53};
			break;
			
		case 11218:
			itemDef.name = "Pet Bluefire Dragon";
			ItemDef itemDef7 = ItemDef.forID(12458);
			itemDef.modelID = itemDef7.modelID;
			itemDef.modelOffset1 = itemDef7.modelOffset1;
			itemDef.modelOffsetX = itemDef7.modelOffsetX;
			itemDef.modelOffsetY = itemDef7.modelOffsetY;
			itemDef.modelZoom = itemDef7.modelZoom;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;

		case 5151:
			itemDef.name = "Pet Hellfire Dragon";
			ItemDef itemDef2 = ItemDef.forID(12458);
			itemDef.modelID = itemDef2.modelID;
			itemDef.modelOffset1 = itemDef2.modelOffset1;
			itemDef.modelOffsetX = itemDef2.modelOffsetX;
			itemDef.modelOffsetY = itemDef2.modelOffsetY;
			itemDef.modelZoom = itemDef2.modelZoom;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
		case 5157:
			itemDef.name = "Pet Bulbasaur";
            itemDef.modelID = 28402;
            itemDef.modelZoom = 2750;
            itemDef.rotationY = 340;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
		case 4742:
			itemDef.name = "Pet Eevee";
            itemDef.modelID = 44203;
            itemDef.modelZoom = 2750;
            itemDef.rotationY = 340;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
			
		case 19753:
			itemDef.name = "Pet Rainbow Eevee";
            itemDef.modelID = 44287;
            itemDef.modelZoom = 2750;
            itemDef.rotationY = 340;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
			
		case 4743:
			itemDef.name = "Pet Jolteon";
            itemDef.modelID = 44206;
            itemDef.modelZoom = 2750;
            itemDef.rotationY = 340;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
		case 4744:
			itemDef.name = "Pet Flareon";
            itemDef.modelID = 44207;
            itemDef.modelZoom = 2750;
            itemDef.rotationY = 340;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
			
		case 4786:
			itemDef.name = "Pet Vapereon";
            itemDef.modelID = 44208;
            itemDef.modelZoom = 2750;
            itemDef.rotationY = 340;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
			
		case 4787:
			itemDef.name = "Pet Sylveon";
            itemDef.modelID = 44211;
            itemDef.modelZoom = 2750;
            itemDef.rotationY = 340;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
		case 1648:
			itemDef.name = "Pet AntMan";
            itemDef.modelID = 94278;
            itemDef.modelZoom = 2750;
            itemDef.rotationY = 340;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
			
		case 1647:
			itemDef.name = "Pet Mewtwo";
            itemDef.modelID = 23975;
            itemDef.modelZoom = 2750;
            itemDef.rotationY = 340;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;

			case 22204:
				itemDef.name = "Pet Assassin";
				itemDef.modelID = 7785;
				itemDef.modelZoom = 2750;
				itemDef.rotationY = 340;
				itemDef.rotationX = 0;
				itemDef.groundActions = new String[] { null, null, "Take", null, null };
				itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
				break;

		case 1855:
			itemDef.name = "Pet Zorbak";
            itemDef.modelID = 23973;
            itemDef.modelZoom = 2750;
            itemDef.rotationY = 340;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
		case 2756:
			itemDef.name = "Pet Stoned Toad";
            itemDef.modelID = 23969;
            itemDef.modelZoom = 2750;
            itemDef.rotationY = 340;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
		case 2757:
			itemDef.name = "Drakkon Pet";
            itemDef.modelID = 23974;
            itemDef.modelZoom = 2000;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
		case 2758:
			itemDef.name = "Galvek Pet";
            itemDef.modelID = 23970;
            itemDef.modelZoom = 2750;
            itemDef.rotationY = 340;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
		case 2759:
			itemDef.name = "Vasa Nistirio Pet";
            itemDef.modelID = 23967;
            itemDef.modelZoom = 2000;
            itemDef.rotationX = 0;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
			
		case 2762:
			itemDef.name = "Supreme Darkbeast Pet";
            itemDef.modelID = 23968;
            itemDef.modelZoom = 2000;
            itemDef.rotationX = 0;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
			
		case 2763:
			itemDef.name = "Eternal Dragon Pet";
            itemDef.modelID = 23966;
            itemDef.modelZoom = 2000;
            itemDef.rotationX = 0;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
		case 2764:
			itemDef.name = "Leo the Lion Pet";
            itemDef.modelID = 23976;
            itemDef.modelZoom = 2750;
            itemDef.rotationY = 340;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
		case 18377:
			itemDef.name = "Pet Lucario";
            itemDef.modelID = 23141;
            itemDef.modelZoom = 2750;
            itemDef.rotationY = 340;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;

		case 5161:
			itemDef.name = "Pet Joker";
            itemDef.modelID = 23107;
            itemDef.modelZoom = 2750;
            itemDef.rotationY = 340;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
        case 5561:
            itemDef.name = "VIP Gem";
            break;
            
        case 7678:
            itemDef.name = "VIP Key";
            break;
			
		case 18620:
			itemDef.name = "Pet Elemental";
			itemDef2 = ItemDef.forID(12458);
            itemDef.modelZoom = 2750;
            itemDef.rotationY = 340;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
		case 5160:
			itemDef.name = "Pet Charmander";
            itemDef.modelID = 28401;
            itemDef.modelZoom = 1750;
            itemDef.rotationY = 0;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
		case 5162:
			itemDef.name = "Charizard Pet";
            itemDef.modelID = 28405;
            itemDef.modelZoom = 2500;
            itemDef.rotationY = 0;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
		case 14469:
			itemDef.name = "Key loop";
			break;
		case 14470:
			itemDef.name = "Key Teeth";
			break;
			
		case 14471:
			itemDef.name = "Dungeon Key";
			break;

		case 5163:
			itemDef.name = "Broly Jr(DOUBLE VOTE PET)";
            itemDef.modelID = 27631;
            itemDef.modelZoom = 1750;
            itemDef.rotationY = 0;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
			
		case 5148:
			itemDef.name = "Skotizo Jr";
			ItemDef.copyModel(itemDef, 12458);
            itemDef.modelZoom = 1750;
            itemDef.rotationY = 0;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
		case 5127:
			itemDef.name = "Goku Jr";
			ItemDef.copyModel(itemDef, 12458);
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
		case 5135:
			itemDef.name = "Fuzed Goku Jr";
			ItemDef.copyModel(itemDef, 12458);
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
		case 5128:
			itemDef.name = "Vegeta Jr";
			ItemDef.copyModel(itemDef, 12458);
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
		case 12001:
			itemDef.name = "Beast Pet";
            itemDef.modelID = 50945;
            itemDef.modelZoom = 8750;
            itemDef.rotationY = 0;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
		case 12683:
			itemDef.name = "Godzilla Jr";
            itemDef.modelID = 97210;
            itemDef.modelZoom = 1750;
            itemDef.rotationY = 0;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
		case 5166:
			itemDef.name = "Cookie Monster Pet";
            itemDef.modelID = 28328;
            itemDef.modelZoom = 1750;
            itemDef.rotationY = 0;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
		case 18400:
			itemDef.name = "Pet Bugatti";
            itemDef.modelID = 13006;
            itemDef.modelZoom = 1750;
            itemDef.rotationY = 0;
            itemDef.rotationX = 0;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;
			
		case 19932:
			itemDef.name = "Pet Prime Walking Legs";
			itemDef2 = ItemDef.forID(12458);
			itemDef.modelID = itemDef2.modelID;
			itemDef.modelOffset1 = itemDef2.modelOffset1;
			itemDef.modelOffsetX = itemDef2.modelOffsetX;
			itemDef.modelOffsetY = itemDef2.modelOffsetY;
			itemDef.modelZoom = itemDef2.modelZoom;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;

		case 5152:
			itemDef.name = "Pet Bluefire Dragon";
			itemDef2 = ItemDef.forID(12458);
			itemDef.modelID = itemDef2.modelID;
			itemDef.modelOffset1 = itemDef2.modelOffset1;
			itemDef.modelOffsetX = itemDef2.modelOffsetX;
			itemDef.modelOffsetY = itemDef2.modelOffsetY;
			itemDef.modelZoom = itemDef2.modelZoom;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;

		case 4647:
			itemDef.name = "Onyx Platebody";
			break;
		case 4648:
			itemDef.name = "Onyx Platelegs";
			break;
		case 4649:
			itemDef.name = "Onyx FullHelm";
			break;
		case 4762:
			itemDef.name = "Kings platebody";
			break;
		case 4763:
			itemDef.name = "Kings platelegs";
			break;
			
		case 3981:
			itemDef.name = "Onyx Cape";
			break;
		case 5153:
			itemDef.name = "Pet Lava Dragon";
			itemDef2 = ItemDef.forID(12458);
			itemDef.modelID = itemDef2.modelID;
			itemDef.modelOffset1 = itemDef2.modelOffset1;
			itemDef.modelOffsetX = itemDef2.modelOffsetX;
			itemDef.modelOffsetY = itemDef2.modelOffsetY;
			itemDef.modelZoom = itemDef2.modelZoom;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;

		case 5154:
			itemDef.name = "Pet Cool Dragon";
			itemDef2 = ItemDef.forID(12458);
			itemDef.modelID = itemDef2.modelID;
			itemDef.modelOffset1 = itemDef2.modelOffset1;
			itemDef.modelOffsetX = itemDef2.modelOffsetX;
			itemDef.modelOffsetY = itemDef2.modelOffsetY;
			itemDef.modelZoom = itemDef2.modelZoom;
			itemDef.groundActions = new String[] { null, null, "Take", null, null };
			itemDef.actions = new String[] { null, null, "Summon", null, "Drop" };
			break;

			case 22185:
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wield";
				itemDef.modelID = 74510;
				itemDef.modelZoom = 1500;
				itemDef.rotationY = 500;
				itemDef.rotationX = 0;
				itemDef.modelOffsetY = -6;
				itemDef.modelOffsetX = 1;
				itemDef.maleEquip1 = 74511;
				itemDef.femaleEquip1 = 74511;
				itemDef.name = "Purple Knight Sword";
				break;

			case 22196:
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wield";
				itemDef.modelID = 7782;
				itemDef.modelZoom = 1500;
				itemDef.rotationY = 500;
				itemDef.rotationX = 0;
				itemDef.modelOffsetY = -6;
				itemDef.modelOffsetX = 1;
				itemDef.maleEquip1 = 7783;
				itemDef.femaleEquip1 = 7783;
				itemDef.editedModelColor = new int[] {40};
				itemDef.newModelColor = new int[]  {51};
				itemDef.name = "@red@Assassin Sword";
				break;

			case 22197:
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wield";
				itemDef.modelID = 7782;
				itemDef.modelZoom = 1500;
				itemDef.rotationY = 500;
				itemDef.rotationX = 0;
				itemDef.modelOffsetY = -6;
				itemDef.modelOffsetX = 1;
				itemDef.maleEquip1 = 7784;
				itemDef.femaleEquip1 = 7784;
				itemDef.editedModelColor = new int[] {40};
				itemDef.newModelColor = new int[]  {51};
				itemDef.name = "@red@Assassin Sword Off-Hand";
				break;

			case 22198:
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wield";
				itemDef.modelID = 7773;
				itemDef.modelZoom = 1000;
				itemDef.rotationY = 100;
				itemDef.rotationX = 0;
				itemDef.modelOffsetY = -6;
				itemDef.modelOffsetX = 1;
				itemDef.maleEquip1 = 7774;
				itemDef.femaleEquip1 = 7774;
				itemDef.name = "@red@Assassin Hood";
				break;

			case 22199:
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wield";
				itemDef.modelID = 7775;
				itemDef.modelZoom = 1500;
				itemDef.rotationY = 500;
				itemDef.rotationX = 0;
				itemDef.modelOffsetY = -6;
				itemDef.modelOffsetX = 1;
				itemDef.maleEquip1 = 7776;
				itemDef.femaleEquip1 = 7776;
				itemDef.name = "@red@Assassin PlateBody";
				break;

			case 22200:
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wield";
				itemDef.modelID = 7777;
				itemDef.modelZoom = 1500;
				itemDef.rotationY = 500;
				itemDef.rotationX = 0;
				itemDef.modelOffsetY = -6;
				itemDef.modelOffsetX = 1;
				itemDef.maleEquip1 = 7778;
				itemDef.femaleEquip1 = 7778;
				itemDef.name = "@red@Assassin Legs";
				break;

			case 22201:
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wield";
				itemDef.modelID = 7781;
				itemDef.modelZoom = 1500;
				itemDef.rotationY = 500;
				itemDef.rotationX = 0;
				itemDef.modelOffsetY = -6;
				itemDef.modelOffsetX = 1;
				itemDef.maleEquip1 = 7781;
				itemDef.femaleEquip1 = 7781;
				itemDef.name = "@red@Assassin Boots";
				break;

			case 22202:
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wield";
				itemDef.modelID = 7778;
				itemDef.modelZoom = 1500;
				itemDef.rotationY = 500;
				itemDef.rotationX = 0;
				itemDef.modelOffsetY = -6;
				itemDef.modelOffsetX = 1;
				itemDef.maleEquip1 = 7780;
				itemDef.femaleEquip1 = 7780;
				itemDef.name = "@red@Assassin Gloves";
				break;

			case 22203:
				itemDef.actions = new String[5];
				itemDef.actions[1] = "Wield";
				itemDef.modelID = 7782;
				itemDef.modelZoom = 1300;
				itemDef.rotationY = 800;
				itemDef.rotationX = 0;
				itemDef.modelOffsetY = -6;
				itemDef.modelOffsetX = 1;
				itemDef.maleEquip1 = 7785;
				itemDef.femaleEquip1 = 7785;
				itemDef.name = "@red@Assassin Back Sword";
				break;
		}
		

		switch (itemDef.id) {
		case 6570:
		case 3064:
		case 3978:
		case 3932:
		case 4635:
		case 3973:
		case 4800:
		case 4801:
		case 3983:
		case 3943:
		case 19079:
		case 19080:
		case 3644:
		case 19081:
		case 19082:
		case 19083:
		case 19084:
		case 19085:
		case 19086:
		case 19087:
		case 19088:
		case 19089:
		case 19090:
		case 19091:
		case 3092:
		case 15374:
		case 3824:
		case 3974:
		case 3811:
		case 4630:
		case 4767:
		case 5120:
		case 5121:
		case 5122:
		case 5077:
		case 4751:
		case 4762:
		case 4763:
		case 4764:
		case 4765:
		case 5089:
		case 3907:
		case 3905:
		case 5164:
		case 5139:
		case 5140:
		case 5141:
		case 4769:
		case 5165:
		case 5275:
		case 5276:
		case 3912:
		case 19101:
		case 19103:
		case 5147:
		case 3991:
		case 19900:
		case 19901:
		case 3980:
		case 3982:
		case 3990:
		case 4649:
		case 4648:
		case 4647:
		case 3981:
		case 19990:
		case 19991:
		case 3996:
		case 3995:
		case 3994:
		case 19945:
		case 19943:
		case 19105:
		case 19996:
		case 3956:
			itemDef.animateInventory = true;
			break;
		}
		return itemDef;
	}
}

