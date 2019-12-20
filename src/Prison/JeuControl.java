package Prison;
import java.util.HashMap;

import commands.Commande;
public class JeuControl {
    private final HashMap<String, Commande> commandes = new HashMap<>();

	public HashMap<String, Commande> getCommandes() {
		return commandes;
	}

	public void addCommande(Commande commande, String name) {
        commandes.put(name, commande);
    }

    public void execute(String commandName) {
    	Commande command = commandes.get(commandName);
        if (command == null) {
            throw new IllegalStateException("no command registered for " + commandName);
        }
        command.execute();
    }

    public void reset() {
        commandes.clear();        
    }
}
