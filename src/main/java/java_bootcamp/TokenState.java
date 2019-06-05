package java_bootcamp;

import com.google.common.collect.ImmutableList;
import net.corda.core.contracts.ContractState;
import net.corda.core.identity.AbstractParty;
import net.corda.core.identity.Party;


/* Our state, defining a shared fact on the ledger.
 * See src/main/java/examples/ArtState.java for an example. */
public class TokenState implements ContractState {
    private Party issuer;
    private Party owner;
    private int amount;

    TokenState(Party issuer,Party owner,int amount){
        this.issuer = issuer;
        this.owner = owner;
        this.amount = amount;
    }


    public Party getIssuer() {
        return issuer;
    }

    public void setIssuer(Party issuer) {
        this.issuer = issuer;
    }

    public Party getOwner() {
        return owner;
    }

    public void setOwner(Party owner) {
        this.owner = owner;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public List<AbstractParty> getParticipants() {
        return ImmutableList.of(owner,issuer);
    }
}