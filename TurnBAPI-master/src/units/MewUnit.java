package units;

import units.interactions.UnitButtonAttack;
import units.interactions.UnitButtonMove;
import attribute.Attribute;
import attribute.AttributeAttack;
import attribute.AttributeAvailableActions;
import attribute.AttributeExperience;
import attribute.AttributeHealth;
import attribute.AttributeImage;
import attribute.AttributeLevel;
import attribute.AttributeMove;
import attribute.AttributeReactable;

public class MewUnit extends Unit{
    
    public MewUnit() {
        unitAttributeList.add(new AttributeMove(this,10));
        unitAttributeList.add(new AttributeAttack(this,15,3,2));
        unitAttributeList.add(new AttributeHealth(this,85));
        unitAttributeList.add(new AttributeReactable(this));
        unitAttributeList.add(new AttributeLevel(this,2));
        unitAttributeList.add(new AttributeExperience(this));
        unitAttributeList.add(new AttributeImage(this, imageFilepath()));
        // turn attribute, determines only one attribute interaction per turn
        // maybe connect this more to interactions class
        AttributeAvailableActions turn = new AttributeAvailableActions(this);
        turn.augmentData(Attribute.MOVES);
        turn.augmentData(Attribute.ATTACK);
        unitAttributeList.add(turn);

        interactionList.add(new UnitButtonMove());
        interactionList.add(new UnitButtonAttack());
    }

    @Override
    public String unitName() {
        return "Mew";
    }

    @Override
    public String imageFilepath() {
        return "resources/unit images/Mew.png";
    }


    public String toString() {
        return "MewUnit [unitName()=" + unitName() + ", imageFilepath()="
                + imageFilepath() + ", addButton()=" + addButton()
                + ",attributeList=" + unitAttributeList + ", interactionList="
                + interactionList + "]";
    }

    @Override
    public String addButton() {
        // TODO Auto-generated method stub
        return PikachuUnit.PIKACHU_ADD_BUTTON;
    }

}
