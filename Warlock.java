public class Warlock extends Character {
    Warlock(String name){
        super(name);
    }
   
    public void Meteor(Character enemyCharacter){
        System.out.println("===="+super.characterName + " attacks " + enemyCharacter.characterName + " with Meteor(Damage - 50) (Mana - 30)====");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 30;
        manaTarget(enemyCharacter, manaPoints);

    }
    public void Fireball(Character enemyCharacter){
        System.out.println("===="+super.characterName + " attacks " + enemyCharacter.characterName + " with  Fireball (Damage - 60) (Mana - 40)====");
        int damagePoints = 60;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 40;
        manaTarget(enemyCharacter, manaPoints);

    } 
    
    public void Tsunami(Character enemyCharacter){
        System.out.println("====" +super.characterName + " attacks " + enemyCharacter.characterName + " with Tsunami (Damage - 60) , (Mana - 25)====");
        int damagePoints = 60;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 25;
        manaTarget(enemyCharacter, manaPoints);
    } 
}
