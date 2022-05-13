public class Wizard extends Character {
    Wizard(String name){
        super(name);
    }
    public void Polymorph(Character enemyCharacter){
        
        System.out.println("====" +super.characterName + " attacks " + enemyCharacter.characterName + " with Polymorph (Damage - 60) (Mana - 20)====");
        int damagePoints = 60;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 20;
        manaTarget(enemyCharacter, manaPoints);

        
    }
    public void WaterTide(Character enemyCharacter){
        System.out.println("====" +super.characterName + " attacks " + enemyCharacter.characterName + " with Watertide (Damage - 60) (Mana - 25)====");
        int damagePoints = 60;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 25;
        manaTarget(enemyCharacter, manaPoints);

       
    }
    public void Firebolt(Character enemyCharacter){
        System.out.println("====" +super.characterName + " attacks " + enemyCharacter.characterName + " with Firebolt (Damage - 60) (Mana - 35)====");
        int damagePoints = 60;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 35;
        manaTarget(enemyCharacter, manaPoints);
    }
    public void Firebolt(Character enemyCharacter){
        System.out.println("====" +super.characterName + " attacks " + enemyCharacter.characterName + " with Firebolt (Damage - 60) (Mana - 35)====");
        int damagePoints = 60;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 35;
        manaTarget(enemyCharacter, manaPoints);

        
    }
    public void FireHeal(Character characterName){
        System.out.println("====" +super.characterName + " Use FireHeal (Heal - 50)====");
        int healPoints = 50;
        healTarget(characterName, healPoints);
        manadTarget(characterName, manaPoints);
    } 
    public void Prestidigitation(Character enemyCharacter){
        System.out.println("====" +super.characterName + " attacks " + enemyCharacter.characterName + " with Prestidigitation(Damage - 60 , Mana- 35)====");
        int damagePoints = 60;
        damageTarget( enemyCharacter, damagePoints);
        int manaPoints = 35;
        manaTargett( enemyCharacter, manaPoints);

        
    }
    public void Clone(Character enemyCharacter){
        System.out.println("====" +super.characterName + " attacks " + enemyCharacter.characterName + " with Clone (Damage - 60 , Mana - 40)====");
        int damagePoints = 60;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 40;
        manaTarget(enemyCharacter, manaPoints);
        levelTarget(enemyCharacter, level);   
    }
    
}

