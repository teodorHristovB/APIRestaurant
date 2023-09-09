package com.ApiMasterBar.APIMasterBar;

import com.ApiMasterBar.APIMasterBar.MappedTables.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserService USERSERVICE;

    @Autowired
    public UserController(UserService userservice) {
        USERSERVICE = userservice;
    }

    @RequestMapping(path = "apiMB/personal")
    public List<Personal> getTodoPersonal(){
        return USERSERVICE.getEmployees();
    }

    @RequestMapping (path = "apiMB/personal/{dni}")
    public Personal getPersona(@PathVariable("dni") String dni){
        return USERSERVICE.getEmployee(dni);
    }
    @RequestMapping(path = "apiMB/users")
    public List<Usuario> getUsuarios(){
        return USERSERVICE.getUsers();
    }
    @RequestMapping(path = "apiMB/users/{id}")
    public Usuario getUser(@PathVariable("id") String dni){
        return USERSERVICE.getUser(dni);
    }

    @RequestMapping(path = "apiMB/drinks")
    public List<Bebida> getBebidas(){
        return USERSERVICE.getBebidas();
    }

    @RequestMapping(path = "apiMB/drinks/{id}")
    public Bebida getBebida(@PathVariable("id") int id){
        return USERSERVICE.getBebida(id);
    }

    @RequestMapping(path = "apiMB/appetizers")
    public List<Entrante> getEntrantes(){
        return USERSERVICE.getEntrantes();
    }
    @RequestMapping(path = "apiMB/appetizers/{id}")
    public Entrante getEntrante(@PathVariable("id") int id){
        return USERSERVICE.getEntrante(id);
    }

    @RequestMapping(path = "apiMB/dishes")
    public List<Plato> getPlatos(){
        return USERSERVICE.getPlatos();
    }

    @RequestMapping(path = "apiMB/dish/{id}")
    public Plato getPlato(@PathVariable("id") int id){
        return USERSERVICE.getPlato(id);
    }

    @RequestMapping(path = "apiMB/desserts")
    public List<Postre> getPostres(){
        return USERSERVICE.getPostres();
    }
    @RequestMapping(path = "apiMB/desserts/{id}")
    public Postre getPostre(@PathVariable("id") int id){
        return USERSERVICE.getPostre(id);
    }

    @RequestMapping(path = "apiMB/tables")
    public List<Mesa> getMesas(){
        return USERSERVICE.getTables();
    }

    @RequestMapping(path = "apiMB/tables/{id}")
    public Mesa getMesa(@PathVariable int id){
        return USERSERVICE.getMesa(id);
    }
    @RequestMapping(path = "apiMB/orders")
    public List<Pedido> getPedidos(){
        return USERSERVICE.getOrders();
    }

    @RequestMapping(path = "apiMB/orders/{id}")
    public Pedido getPedido(@PathVariable int id){
        return USERSERVICE.getOrder(id);
    }

    @RequestMapping(path = "apiMB/orders/detailsDrinks")
    public List<DetallesBebidas> getDetallesBebidas(){
        return USERSERVICE.getDetallesBebidas();
    }

    @RequestMapping(path = "apiMB/orders/detailsDrinks/{id}")
    public List<DetallesBebidas> getDetalleBebida(@PathVariable int id){
        return USERSERVICE.getDetalleBebida(id);
    }

    @RequestMapping(path = "apiMB/orders/detailsAppetizers")
    public List<DetallesEntrantes> getDetallesEntrantes(){
        return USERSERVICE.getDetallesEntrantes();
    }

    @RequestMapping(path = "apiMB/orders/detailsAppetizers/{id}")
    public List<DetallesEntrantes> getDetallesEntrante(@PathVariable int id){
        return USERSERVICE.getDetallesEntrante(id);
    }

    @RequestMapping(path = "apiMB/orders/detailsDishes")
    public List<DetallesPlatos> getDetallesPlatos(){
        return USERSERVICE.getDetallesPlatos();
    }

    @RequestMapping(path = "apiMB/orders/detailsDishes/{id}")
    public List<DetallesPlatos> getDetallesPlato(@PathVariable int id){
        return USERSERVICE.getDetallePlato(id);
    }
    @RequestMapping(path = "apiMB/orders/detailsDesserts")
    public List<DetallesPostres> getDetallesPostres(){
        return USERSERVICE.getDetallesPostres();
    }

    @RequestMapping(path = "apiMB/orders/detailsDesserts/{id}")
    public List<DetallesPostres> getDetallePostre(@PathVariable int id){
        return USERSERVICE.getDetallesPostre(id);
    }

    @PostMapping("apiMB/orders")
    public void addOrder(@RequestBody Pedido pedido){
        USERSERVICE.addOrder(pedido);
    }

    @PostMapping("apiMB/orders/detailsDrinks")
    public void addDetailDrink(@RequestBody DetallesBebidas bebidas){
            USERSERVICE.addDetailDrink(bebidas);
    }

    @PostMapping("apiMB/orders/detailsAppetizers")
    public void addDetailAppetizer(@RequestBody DetallesEntrantes entrante){
        USERSERVICE.addDetailAppetizer(entrante);
    }

    @PostMapping("apiMB/orders/detailsDishes")
    public void addDetailDishes(@RequestBody DetallesPlatos plato){
        USERSERVICE.addDetailDishes(plato);
    }

    @PostMapping("apiMB/orders/detailsDesserts")
    public void addDetailsDesserts(@RequestBody DetallesPostres postre){
        USERSERVICE.addDetailDesserts(postre);
    }


    @PostMapping("apiMB/tables")
    public void addTable(@RequestBody Mesa mesa){
        USERSERVICE.addTable(mesa);
    }

    @DeleteMapping("apiMB/tables/{id}")
    public void deleteTable(Mesa mesa){
        USERSERVICE.deleteTable(mesa);
    }

}
