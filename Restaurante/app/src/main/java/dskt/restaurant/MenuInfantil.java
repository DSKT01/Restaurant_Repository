package dskt.restaurant;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;

import java.util.ArrayList;

public class MenuInfantil extends Activity {
    private ListView lvItems;
    private Adaptador adaptador;
    ArrayList<Entidad> lista = new ArrayList<>();
    Entidad item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_infantil);

        lvItems = (ListView)findViewById(R.id.lv_itemsMenuinfantil);

        item = new Entidad("Nuggets............$5.000", "Nuggets de pollo con forma de dinosaurio.");
        lista.add(item);
        item = new Entidad("Helados............$1.000", "De diferentes sabores.");
        lista.add(item);
        item = new Entidad("Megalodon..........$20.000", "Un circo en tu plato.");
        lista.add(item);

        adaptador = new Adaptador(lista, this);
        lvItems.setAdapter(adaptador);
    }

}
