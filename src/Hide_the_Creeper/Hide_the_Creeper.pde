PImage creeper;
int creeperX = 197;
int creeperY = 354;

void setup() {
size(600,600);



creeper=loadImage("creeper.png");
creeper.resize(10, 10);

}

void draw() {
PImage greenthing = loadImage("greenthing.jpg");
greenthing.resize(600, 600);
background(greenthing);
image(creeper, creeperX, creeperY);
fill(255, 0, 0);
noStroke();
ellipse(mouseX, mouseY, 20, 20);
if(isNear(197, mouseX) && isNear(354, mouseY)) {
  fill(29, 209, 62);
  ellipse(mouseX, mouseY, 20, 20);
  println("You found the creeper!");
}

}

boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}
