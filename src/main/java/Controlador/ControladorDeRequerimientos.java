package Controlador;

// Librerías para SQL y Base de Datos
import java.sql.SQLException;

// Estructura de datos - lista
import java.util.ArrayList;

// Requerimentos
import Modelo.dao.Requerimiento_1Dao;
import Modelo.dao.Requerimiento_2Dao;
import Modelo.dao.Requerimiento_3Dao;
import Modelo.vo.Requerimiento_1;
import Modelo.vo.Requerimiento_2;
import Modelo.vo.Requerimiento_3;

public class ControladorDeRequerimientos {

    private final Requerimiento_1Dao REQUERIMIENTO_1DAO;
    private final Requerimiento_2Dao REQUERIMIENTO_2DAO;
    private final Requerimiento_3Dao REQUERIMIENTO_3DAO;

    // Acceder a los requerimentos
    public ControladorDeRequerimientos(){
        this.REQUERIMIENTO_1DAO= new Requerimiento_1Dao();
        this.REQUERIMIENTO_2DAO= new Requerimiento_2Dao();
        this.REQUERIMIENTO_3DAO= new Requerimiento_3Dao();
    }
    
        public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
            return this.REQUERIMIENTO_1DAO.requerimiento1();
        }
    
        public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
            return this.REQUERIMIENTO_2DAO.requerimiento2();
        }

        public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
            return this.REQUERIMIENTO_3DAO.requerimiento3();
        }
}
