import java.util.*;
abstract class Instrument{
abstract void play();
}

class Piano extends Instrument{
void play()
{
System.out.println("Piano is playing tan tan tan tan.");
}
}

class Flute extends Instrument{
void play(){
System.out.println("Flute is playing toot toot toot toot.");
}
}

class Guitar extends Instrument{
void play(){
System.out.println("Guitar is playing tin tin tin.");
}
}

public class Instruments {
public static void main(String[] args) {
Instrument a[] = new Instrument[10];
int i;
for(i = 0 ; i<3 ; i++)
{
a[i] = new Guitar();
}
for(i=3 ; i<7; i++)
{
a[i] = new Piano();
}
for(i = 7 ; i<=9 ; i++)
{
a[i] = new Flute();
}

for(i=0; i<=9 ; i++)
{
a[i].play();
}
}
}