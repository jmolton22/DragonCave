package HumansVSGoblins;

//Defines Human class for Human VS Goblins game
public class Humans {

    int strength;
    int health;
    String name;


    public Humans(){
        this.strength = 0;
        this.health = 0;
        this.name = "";
    }


    public Humans(int s, int h, String n) {
        this.strength = s;
        this.health = h;
        this.name = n;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int s){
        this.strength = s;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int h){
        this.health = h;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String n){
        this.name = n;
    }

    @Override
    public String toString(){

        return "Type: Human" + "\nName: " +
                this.getName() + "\nHealth: " +
                this.getHealth() + "Strength: " + this.getStrength();
    }

    public void shootGoblin(Goblins goblin){
        if(this.health>goblin.getStrength()) {
            goblin.setStrength(goblin.getStrength() - 2);
            System.out.println("Goblin -2");
        }}
    public void movePlayer(String move){

            try{switch(move){
                case "n": System.out.println(this.getName()+", you are standing further north. " +
                                                     "There are no goblins here.");
                    break;
                case "e": System.out.println(this.getName()+", you are standing further east. " +
                                                     "There are no goblins here.");
                    break;
                case "s": System.out.println(this.getName()+", you are standing further south. " +
                                                     "There are no goblins here.");
                    break;
                case "w": System.out.println(this.getName()+", you are standing further west. " +
                                                     "There are no goblins here.");
                    break;
            }}catch(Exception e){
                System.out.println("Please choose valid direction");
            }

        }

    }




