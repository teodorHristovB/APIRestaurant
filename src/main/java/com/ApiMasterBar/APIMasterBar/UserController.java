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


    @RequestMapping(path = "apiMB")
    public String saludo(){
        return "API MASTERBAR RESTAURANTE";
    }
    @GetMapping(path = "apiMB/personal")
    public List<Personal> getTodoPersonal(){
        return USERSERVICE.getEmployees();
    }

    @GetMapping (path = "apiMB/personal/{dni}")
    public Personal getPersona(@PathVariable("dni") String dni){
        return USERSERVICE.getEmployee(dni);
    }
    @GetMapping(path = "apiMB/users")
    public List<Usuario> getUsuarios(){
        return USERSERVICE.getUsers();
    }
    @GetMapping(path = "apiMB/users/{id}")
    public Usuario getUser(@PathVariable("id") String dni){
        return USERSERVICE.getUser(dni);
    }

    @GetMapping(path = "apiMB/drinks")
    public List<Bebida> getBebidas(){
        return USERSERVICE.getBebidas();
    }

    @GetMapping(path = "apiMB/drinks/{id}")
    public Bebida getBebida(@PathVariable("id") int id){
        return USERSERVICE.getBebida(id);
    }

    @GetMapping(path = "apiMB/appetizers")
    public List<Entrante> getEntrantes(){
        return USERSERVICE.getEntrantes();
    }
    @GetMapping(path = "apiMB/appetizers/{id}")
    public Entrante getEntrante(@PathVariable("id") int id){
        return USERSERVICE.getEntrante(id);
    }

    @GetMapping(path = "apiMB/dishes")
    public List<Plato> getPlatos(){
        return USERSERVICE.getPlatos();
    }

    @GetMapping(path = "apiMB/dish/{id}")
    public Plato getPlato(@PathVariable("id") int id){
        return USERSERVICE.getPlato(id);
    }

    @GetMapping(path = "apiMB/desserts")
    public List<Postre> getPostres(){
        return USERSERVICE.getPostres();
    }
    @GetMapping(path = "apiMB/desserts/{id}")
    public Postre getPostre(@PathVariable("id") int id){
        return USERSERVICE.getPostre(id);
    }

    @GetMapping(path = "apiMB/tables")
    public List<Mesa> getMesas(){
        return USERSERVICE.getTables();
    }

    @GetMapping(path = "apiMB/tables/{id}")
    public Mesa getMesa(@PathVariable int id){
        return USERSERVICE.getMesa(id);
    }
    @GetMapping(path = "apiMB/orders")
    public List<Pedido> getPedidos(){
        return USERSERVICE.getOrders();
    }

    @GetMapping(path = "apiMB/orders/{id}")
    public Pedido getPedido(@PathVariable int id){
        return USERSERVICE.getOrder(id);
    }

    @GetMapping(path = "apiMB/orders/detailsDrinks")
    public List<DetallesBebidas> getDetallesBebidas(){
        return USERSERVICE.getDetallesBebidas();
    }

    @GetMapping(path = "apiMB/orders/detailsDrinks/{id}")
    public List<DetallesBebidas> getDetalleBebida(@PathVariable int id){
        return USERSERVICE.getDetalleBebida(id);
    }

    @GetMapping(path = "apiMB/orders/detailsAppetizers")
    public List<DetallesEntrantes> getDetallesEntrantes(){
        return USERSERVICE.getDetallesEntrantes();
    }

    @GetMapping(path = "apiMB/orders/detailsAppetizers/{id}")
    public List<DetallesEntrantes> getDetallesEntrante(@PathVariable int id){
        return USERSERVICE.getDetallesEntrante(id);
    }

    @GetMapping(path = "apiMB/orders/detailsDishes")
    public List<DetallesPlatos> getDetallesPlatos(){
        return USERSERVICE.getDetallesPlatos();
    }

    @GetMapping(path = "apiMB/orders/detailsDishes/{id}")
    public List<DetallesPlatos> getDetallesPlato(@PathVariable int id){
        return USERSERVICE.getDetallePlato(id);
    }
    @GetMapping(path = "apiMB/orders/detailsDesserts")
    public List<DetallesPostres> getDetallesPostres(){
        return USERSERVICE.getDetallesPostres();
    }

    @GetMapping(path = "apiMB/orders/detailsDesserts/{id}")
    public List<DetallesPostres> getDetallePostre(@PathVariable int id){
        return USERSERVICE.getDetallesPostre(id);
    }

    @PostMapping("apiMB/orders")
    public Pedido addOrder(@RequestBody Pedido pedido){
        USERSERVICE.addOrder(pedido);
        return pedido;
    }

    @PostMapping("apiMB/orders/detailsDrinks")
    public DetallesBebidas addDetailDrink(@RequestBody DetallesBebidas bebidas){
            USERSERVICE.addDetailDrink(bebidas);
            return bebidas;
    }

    @PostMapping("apiMB/orders/detailsAppetizers")
    public DetallesEntrantes addDetailAppetizer(@RequestBody DetallesEntrantes entrante){
        USERSERVICE.addDetailAppetizer(entrante);
        return entrante;
    }

    @PostMapping("apiMB/orders/detailsDishes")
    public DetallesPlatos addDetailDishes(@RequestBody DetallesPlatos plato){
        USERSERVICE.addDetailDishes(plato);
        return plato;
    }

    @PostMapping("apiMB/orders/detailsDesserts")
    public DetallesPostres addDetailsDesserts(@RequestBody DetallesPostres postre){
        USERSERVICE.addDetailDesserts(postre);
        return postre;
    }

    @CrossOrigin(origins = "http://localhost:4200/")
    @PostMapping("apiMB/tables")
    public void addTable(@RequestBody Mesa mesa){
        USERSERVICE.addTable(mesa);
    }

    @DeleteMapping("apiMB/tables/{id}")
    public void deleteTable(Mesa mesa){
        USERSERVICE.deleteTable(mesa);
    }

    @PutMapping("apiMB/orders/{id}")
    public Pedido CrearOactualizarPedido(@RequestBody Pedido pedido){
        USERSERVICE.actualizarEstado(pedido);
        return pedido;
    }
}
