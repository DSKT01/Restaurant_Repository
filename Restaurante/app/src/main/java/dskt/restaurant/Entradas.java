package dskt.restaurant;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;

import java.util.ArrayList;

public class Entradas extends Activity {
    private ListView lvItems;
    private Adaptador adaptador;
    ArrayList<Entidad> lista = new ArrayList<>();
    Entidad item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entradas);

        lvItems = (ListView)findViewById(R.id.lv_itemsEntradas);

        item = new Entidad("Cebolla.........$500", "Aros de Cebolla-");
        lista.add(item);
        item = new Entidad("Papitas.........$700", "Papitas criollas.");
        lista.add(item);

        adaptador = new Adaptador(lista, this);
        lvItems.setAdapter(adaptador);
    }

}
