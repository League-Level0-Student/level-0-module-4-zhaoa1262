PImage donkey;
PImage tail;
int x = -1;
int y = -1;
import ddf.minim.*;         
AudioSample woohooSound;         
boolean playSound = true; 

void setup() {
  donkey = loadImage("donkey.jpg");
  tail = loadImage("tail.jpg");
  size(820, 822);
  Minim minim = new Minim(this);     
woohooSound = minim.loadSample("homer-woohoo.wav");   
}

void draw() {

  image(tail, mouseX, mouseY);



  rect(0, 0, 30, 30);
  
  println(mouseX, mouseY);

  if (dist(0, 0, mouseX, mouseY) < 30) {
    background(donkey);
  } 
  
 else {
    background(255, 119, 170);
    if(x!=-1 && y!=-1) {
    image(tail, x, y);
    }
    else {
      image(tail, mouseX, mouseY);
    }
}

   if(dist(340, 339, mouseX, mouseY) < 30) {
if (playSound) {
     woohooSound.trigger();
     playSound = false;
}
   }
  
  
  if (mousePressed) {
    x = mouseX;
    y= mouseY;
    background(donkey);
  }
}