package dskt.restaurant;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;

import java.util.ArrayList;

public class Bebidas extends Activity {
    private ListView lvItems;
    private Adaptador adaptador;
    ArrayList<Entidad> lista = new ArrayList<>();
    Entidad item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas);

        lvItems = (ListView)findViewById(R.id.lv_itemsBebidas);

        item = new Entidad("Jugos Naturales.....$2.000", "Mango, Guayaba, Tomate... en agua y cianuro");
        lista.add(item);
        item = new Entidad("Limonadas...........$1.500", "Limon, Coco");
        lista.add(item);

        adaptador = new Adaptador(lista, this);
        lvItems.setAdapter(adaptador);
    }

}
