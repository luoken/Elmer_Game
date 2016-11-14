package topdown.game;

import java.awt.image.BufferedImage;

public class Assets {

		public static BufferedImage playerRight, playerWalk, playerStand, playerDead, playerLeft,
									grass, bunchOfTrees, brownTreeStub, fallenLeaf, miniBush,
									purpleFlower, yellowFlower,
									bananaWeaponLeft, bananaWeaponRight,
									bananaItem;
		
		
		public static void init(){
			SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/Spritesheet_0.png"));
			SpriteSheet environment = new SpriteSheet(ImageLoader.loadImage("/textures/top_down_environment_sheet.png"));
			SpriteSheet lookLeft = new SpriteSheet(ImageLoader.loadImage("/textures/lookleft.png"));
			
			SpriteSheet weapon = new SpriteSheet(ImageLoader.loadImage("/textures/banana-in-8-bit.png"));
			SpriteSheet weaponRight = new SpriteSheet(ImageLoader.loadImage("/textures/banana-in-8-bitright.png"));

			SpriteSheet bananaitem = new SpriteSheet(ImageLoader.loadImage("/textures/pbj.png"));
			
			playerRight = sheet.crop(361, 10, 71, 71);
			playerStand = sheet.crop(8, 8, 73, 73);
			playerDead = sheet.crop(105, 284, 56, 61); //161/ 345
			playerLeft = lookLeft.crop(10, 10, 71, 71);
			
			
			//environment stuff
			grass = environment.crop(50, 0, 34,21);
			bunchOfTrees = environment.crop(0, 125, 70, 57);
			brownTreeStub = environment.crop(128, 99, 10, 11);
			fallenLeaf = environment.crop(114, 86, 10, 10);
			miniBush = environment.crop(209, 112, 15, 13);
			purpleFlower = environment.crop(112, 112, 7, 6);
			yellowFlower = environment.crop(112, 120, 7, 6);
			
			//items and weapon stuff
			bananaWeaponLeft = weapon.crop(0, 40, 178, 98);
			bananaWeaponRight = weaponRight.crop(0, 40, 178, 98);
			bananaItem = bananaitem.crop(0, 0, 140, 150);
			
			
			
//			ground = environment.crop(671, 470, width, height);//753 528
//			bush = environment.crop(669, 326, width, height); //742 398

		}
}
