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
    public UserService(UserRepository userrepository, DrinksRepository drinkrepository, AppetizerRepository appetizerrepository, DishRepository dishrepository, DessertRepository desserrepository, EmployeeRepository employeerepository, TableRepository tablerepository, OrdersRepository orderrepository, DetailsDrinksOrders detailsdrinksorders, DetailsAppetizers detailsappetizers, DetailsDishes detailsdishes, DetailsDesserts detailsdesserts) {
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

    @GetMapping
    public List<DetallesBebidas> getDetallesBebidas(){
        return DETAILSDRINKSORDERS.findAll();
    }

    @GetMapping
    public List<DetallesBebidas> getDetalleBebida(int id_pedido){
        List<DetallesBebidas> list = DETAILSDRINKSORDERS.findAll();
        List<DetallesBebidas> listaBuena = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId_pedido() == id_pedido){
                listaBuena.add(list.get(i));
            }
        }
        return listaBuena;

    }

    @GetMapping
    public List<DetallesEntrantes> getDetallesEntrantes(){
        return DETAILSAPPETIZERS.findAll();
    }

    @GetMapping
    public List<DetallesEntrantes> getDetallesEntrante(int id_pedido){
        List<DetallesEntrantes> list = DETAILSAPPETIZERS.findAll();
        List<DetallesEntrantes> listaBuena = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId_pedido() == id_pedido){
                listaBuena.add(list.get(i));
            }
        }
        return listaBuena;
    }

    @GetMapping
    public List<DetallesPlatos> getDetallesPlatos(){
        return DETAILSDISHES.findAll();
    }

    @GetMapping
    public List<DetallesPlatos> getDetallePlato(int id_pedido){
        List<DetallesPlatos> list = DETAILSDISHES.findAll();
        List<DetallesPlatos> listaBuena = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId_pedido() == id_pedido){
                listaBuena.add(list.get(i));
            }
        }
        return listaBuena;
    }

    @GetMapping
    public List<DetallesPostres> getDetallesPostres(){
        return DETAILSDESSERTS.findAll();
    }

    @GetMapping
    public List<DetallesPostres> getDetallesPostre(int id_pedido){
        List<DetallesPostres> list = DETAILSDESSERTS.findAll();
        List<DetallesPostres> listaBuena = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId_pedido() == id_pedido){
                listaBuena.add(list.get(i));
            }
        }
        return listaBuena;
    }

    @GetMapping
    public List<Mesa> getTables(){
        return TABLEREPOSITORY.findAll();
    }
    @GetMapping
    public Mesa getMesa(int id){
        return TABLEREPOSITORY.findAll().stream().filter(t->t.getId() == id).findFirst().get();
    }

    @GetMapping
    public List<Pedido> getOrders(){
        return ORDERREPOSITORY.findAll();
    }

    public Pedido getOrder(int id){
        return ORDERREPOSITORY.findAll().stream().filter(t -> t.getId() == id).findFirst().get();
    }
    @GetMapping
    public List<Personal> getEmployees(){
        return EMPLOYEEREPOSITORY.findAll();
    }
    @GetMapping
    public Personal getEmployee(String dni){
        return EMPLOYEEREPOSITORY.findAll().stream().filter(t->t.getDni().equals(dni)).findFirst().get();
    }
    @GetMapping
    public List<Usuario> getUsers(){
        return USERREPOSITORY.findAll();
    }
    @GetMapping
    public List<Bebida> getBebidas(){
        return DRINKREPOSITORY.findAll();
    }
    @GetMapping
    public List<Entrante> getEntrantes(){
        return APPETIZERREPOSITORY.findAll();
    }
    @GetMapping
    public List<Plato> getPlatos(){
        return DISHREPOSITORY.findAll();
    }
    @GetMapping
    public List<Postre> getPostres(){
        return DESSERREPOSITORY.findAll();
    }

    @GetMapping
    public Usuario getUser(String dni){
        return getUsers().stream().filter(t -> t.getDni().equals(dni)).findFirst().get();
    }

    @GetMapping
    public Bebida getBebida(int id){
        return getBebidas().stream().filter(t -> t.getId() == id).findFirst().get();
    }
    @GetMapping
    public Entrante getEntrante(int id){
        return getEntrantes().stream().filter(t -> t.getId() == id).findFirst().get();
    }
    @GetMapping
    public Plato getPlato(int id){
        return getPlatos().stream().filter(t -> t.getId() == id).findFirst().get();
    }
    @GetMapping
    public Postre getPostre(int id){
        return getPostres().stream().filter(t -> t.getId() == id).findFirst().get();
    }


    public void addOrder(Pedido p) {
        System.out.println(p);
        Pedido pedido = new Pedido();
        pedido.setId(p.getId());
        pedido.setEstado(p.getEstado());
        pedido.setMesa(p.getMesa());
        pedido.setFecha(p.getFecha());
        pedido.setDniPersonal(p.getDniPersonal());
        pedido.setPrecio_total(p.getPrecio_total());
        ORDERREPOSITORY.save(p);
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
}