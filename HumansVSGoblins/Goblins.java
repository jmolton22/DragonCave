package HumansVSGoblins;

//Defines Goblin Class for Humans Vs Goblins Game
public class Goblins {
    private int strength;
    private int stamina ;
    private String name;
    private String color;

    public Goblins(){
        this.strength = 0;
        this.stamina = 0;
        this.name = "";
        this.color = "";
    }

    public Goblins(int s, int stm, String n, String c){
        this.strength = s;
        this.stamina = stm;
        this.name = n;
        this.color = c;
    }

    public int getStrength(){
        return this.strength;
    }

    public void setStrength(int s){
        this.strength = s;
    }

    public int getStamina(){
        return this.stamina;
    }

    public void setStamina(int stm){
        this.stamina = stm;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String n){
        this.name = n;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String c){
        this.color = c;
    }

    public void attack(Humans human){
        human.setStrength(human.getStrength()-1);
        System.out.println("Human -1");
        }
    @Override

    public String toString(){
        return "Type: Goblin" + "\nName: " + this.getName() +
                "\nStrength: " + this.getStrength() +
                 "\nColor: " + this.getColor() +
                 "\nStamina: " + this.getStamina();
    }
}

