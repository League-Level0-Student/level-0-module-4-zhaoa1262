PImage face;
void setup () {
size(800,625);
 face = loadImage("hedgehog17_large.jpg");
 face.resize (800,625);
 
}

void draw() {
background(face);

noStroke();

println(mouseY);

if(mouseX<217) {
mouseX=217;
}

if(mouseX>283) {
mouseX = 283;
}

if(mouseY<251) {
mouseY = 251;
}

if(mouseY>325) {
mouseY = 325;
}

  fill(255,255,255);
  ellipse(250,290,90,90);
  
  fill(0,0,0);
  ellipse(mouseX,mouseY,25,25);
  
  
  fill(255,255,255);
  ellipse(400, 240, 90, 90);
  
  fill(0,0,0);
  ellipse(mouseX + 150, mouseY - 50, 25, 25);
}