package com.ApiMasterBar.APIMasterBar;

import com.ApiMasterBar.APIMasterBar.MappedTables.*;
import com.ApiMasterBar.APIMasterBar.repositorios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository USERREPOSITORY;
    private final DrinksRepository DRINKREPOSITORY;
    private final AppetizerRepository APPETIZERREPOSITORY;
    private final DishRepository DISHREPOSITORY;
    private final DessertRepository DESSERREPOSITORY;
    private final EmployeeRepository EMPLOYEEREPOSITORY;
    private final TableRepository TABLEREPOSITORY;
    private final OrdersRepository ORDERREPOSITORY;
    private final DetailsDrinksOrders DETAILSDRINKSORDERS;
    private final DetailsAppetizers DETAILSAPPETIZERS;
    private final DetailsDishes DETAILSDISHES;
    private final DetailsDesserts DETAILSDESSERTS;

    @Autowired
    public UserService(UserRepository userrepository, DrinksRepository drinkrepository,
                       AppetizerRepository appetizerrepository, DishRepository dishrepository,
                       DessertRepository desserrepository, EmployeeRepository employeerepository,
                       TableRepository tablerepository, OrdersRepository orderrepository,
                       DetailsDrinksOrders detailsdrinksorders, DetailsAppetizers detailsappetizers,
                       DetailsDishes detailsdishes, DetailsDesserts detailsdesserts) {
        USERREPOSITORY = userrepository;
        DRINKREPOSITORY = drinkrepository;
        APPETIZERREPOSITORY = appetizerrepository;
        DISHREPOSITORY = dishrepository;
        DESSERREPOSITORY = desserrepository;
        EMPLOYEEREPOSITORY = employeerepository;
        TABLEREPOSITORY = tablerepository;
        ORDERREPOSITORY = orderrepository;
        DETAILSDRINKSORDERS = detailsdrinksorders;
        DETAILSAPPETIZERS = detailsappetizers;
        DETAILSDISHES = detailsdishes;
        DETAILSDESSERTS = detailsdesserts;
    }


    public List<DetallesBebidas> getDetallesBebidas(){
        return DETAILSDRINKSORDERS.findAll();
    }


    public List<DetallesBebidas> getDetalleBebida(int id_pedido){
        List<DetallesBebidas> list = DETAILSDRINKSORDERS.findAll();
        List<DetallesBebidas> listaBuena = new ArrayList<>();
        list.forEach(n -> {
            if(n.getId_pedido() == id_pedido){
                listaBuena.add(n);
            }
        });
        /*
        List<DetallesBebidas> listaBuena = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId_pedido() == id_pedido){
                listaBuena.add(list.get(i));
            }
        }*/
        return listaBuena;

    }


    public List<DetallesEntrantes> getDetallesEntrantes(){
        return DETAILSAPPETIZERS.findAll();
    }


    public List<DetallesEntrantes> getDetallesEntrante(int id_pedido){
        List<DetallesEntrantes> list = DETAILSAPPETIZERS.findAll();
        List<DetallesEntrantes> listaBuena = new ArrayList<>();
        list.forEach(n -> {
            if(n.getId_pedido() == id_pedido){
                listaBuena.add(n);
            }
        });
        /*
        List<DetallesEntrantes> listaBuena = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId_pedido() == id_pedido){
                listaBuena.add(list.get(i));
            }
        }*/
        return listaBuena;
    }


    public List<DetallesPlatos> getDetallesPlatos(){
        return DETAILSDISHES.findAll();
    }


    public List<DetallesPlatos> getDetallePlato(int id_pedido){
        List<DetallesPlatos> list = DETAILSDISHES.findAll();
        List<DetallesPlatos> listaBuena = new ArrayList<>();
        list.forEach(n -> {
            if(n.getId_pedido() == id_pedido){
                listaBuena.add(n);
            }
        });
        /*
        List<DetallesPlatos> listaBuena = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId_pedido() == id_pedido){
                listaBuena.add(list.get(i));
            }
        }*/
        return listaBuena;
    }


    public List<DetallesPostres> getDetallesPostres(){
        return DETAILSDESSERTS.findAll();
    }


    public List<DetallesPostres> getDetallesPostre(int id_pedido){
        List<DetallesPostres> list = DETAILSDESSERTS.findAll();
        List<DetallesPostres> listaBuena = new ArrayList<>();
        list.forEach(n -> {
            if(n.getId_pedido() == id_pedido){
                listaBuena.add(n);
            }
        });
        /*
        List<DetallesPostres> listaBuena = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId_pedido() == id_pedido){
                listaBuena.add(list.get(i));
            }
        }*/
        return listaBuena;
    }


    public List<Mesa> getTables(){
        return TABLEREPOSITORY.findAll();
    }

    public Mesa getMesa(int id){
        return TABLEREPOSITORY.findAll().stream().filter(t->t.getId() == id).findFirst().get();
    }


    public List<Pedido> getOrders(){
        return ORDERREPOSITORY.findAll();
    }

    public Pedido getOrder(int id){
        return ORDERREPOSITORY.findAll().stream().filter(t -> t.getId() == id).findFirst().get();
    }

    public List<Personal> getEmployees(){
        return EMPLOYEEREPOSITORY.findAll();
    }

    public Personal getEmployee(String dni){
        return EMPLOYEEREPOSITORY.findAll().stream().filter(t->t.getDni().equals(dni)).findFirst().get();
    }

    public List<Usuario> getUsers(){
        return USERREPOSITORY.findAll();
    }

    public List<Bebida> getBebidas(){
        return DRINKREPOSITORY.findAll();
    }

    public List<Entrante> getEntrantes(){
        return APPETIZERREPOSITORY.findAll();
    }

    public List<Plato> getPlatos(){
        return DISHREPOSITORY.findAll();
    }

    public List<Postre> getPostres(){
        return DESSERREPOSITORY.findAll();
    }


    public Usuario getUser(String dni){
        return getUsers().stream().filter(t -> t.getDni().equals(dni)).findFirst().get();
    }


    public Bebida getBebida(int id){
        return getBebidas().stream().filter(t -> t.getId() == id).findFirst().get();
    }

    public Entrante getEntrante(int id){
        return getEntrantes().stream().filter(t -> t.getId() == id).findFirst().get();
    }

    public Plato getPlato(int id){
        return getPlatos().stream().filter(t -> t.getId() == id).findFirst().get();
    }

    public Postre getPostre(int id){
        return getPostres().stream().filter(t -> t.getId() == id).findFirst().get();
    }


    public void addOrder(Pedido p) {

        int id = p.getId();
        Optional<Pedido> existingEntity = ORDERREPOSITORY.findById(id);

        if (existingEntity.isPresent()) {
            throw new IllegalArgumentException("El registro con el ID " + id + " ya existe, no se puede crear un nuevo pedido con ese ID");
        } else {
            ORDERREPOSITORY.save(p);
        }

    }

    public void addDetailDrink(DetallesBebidas bebidas){

        DETAILSDRINKSORDERS.save(bebidas);
    }

    public void addDetailAppetizer(DetallesEntrantes entrante){
        DETAILSAPPETIZERS.save(entrante);
    }

    public void addDetailDishes(DetallesPlatos plato){
        DETAILSDISHES.save(plato);
    }

    public void addDetailDesserts(DetallesPostres postre){
        DETAILSDESSERTS.save(postre);
    }

    public void addTable(Mesa mesa){
        TABLEREPOSITORY.save(mesa);
    }

    public void deleteTable(Mesa mesa){
        TABLEREPOSITORY.delete(mesa);
    }

    public void actualizarEstado(Pedido pedido) {
        ORDERREPOSITORY.save(pedido);
    }
}
