package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InformacionComplementaria {

    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(xpath = "//div[@data-render-xpath='m_Cat_Transversales.idm_CCL_ConsultaCliente.idp_CanalVentas']//input")
    private WebElement canalVenta;
    @FindBy(xpath = "//div[@data-render-xpath='m_Cat_Transversales.idm_CCL_ConsultaCliente.idp_CanalVentas']//li[contains(text(),'Sucursales fisicas')]")
    private WebElement seleccionarCanalVenta ;
     @FindBy(xpath = "//div[1][@data-render-xpath="m_Cat_Transversales.idm_CCL_ConsultaCliente.COL_Clientes"]//tbody[1][@class='ui-bizagi-grid-body']/tr")
    private WebElement seleccionarTitular ;
    @FindBy(xpath = "//ul/li[@title='Editar Titular/Locatario']")
    private WebElement editarTitutar ;
    @FindBy(xpath = "//*[@data-render-xpath='idm_ClienteDatosVariables.idm_Cliente.dFechaExpedicion']//input")
    private WebElement fechaExpedicion ;
    @FindBy(xpath = "//*[@data-render-xpath='idm_ClienteDatosVariables.idm_Cliente.dFechaNacimiento']//input")
    private WebElement fechaNacimiento;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_Cliente.sPrimerNombre']//input")
    private WebElement nombre ;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_Cliente.sPrimerApellido']//input")
    private WebElement apellido;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_Cliente.idp_Nacionalidad']//div/input")
    private WebElement nacionalidad  ;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_Cliente.idp_Nacionalidad']//div/ul/li[50]")
    private WebElement seleccionarNacionalidad  ;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_Cliente.idp_Genero']//input")
    private WebElement genero ;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_Cliente.idp_Genero']//div/ul/li[contains(text(),'FEMENINO')]")
    private WebElement seleccionarGenero ;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idp_EstadoCivil']//input")
    private WebElement estadoCivil ;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idp_EstadoCivil']//ul/li[contains(text(),'Soltero')]")
    private WebElement seleccionarEstadoCivil;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idp_PersonasACargo']//div/i")
    private WebElement personasAcargo;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idp_PersonasACargo']//div/ul/li[contains(text(),'0')]")
    private WebElement seleccionarPersonasACargo;
    @FindBy(xpath = "//*[@data-render-xpath='idm_ClienteDatosVariables.idp_NivelAcademico']/div")
    private WebElement nivelAcademico ;
    @FindBy(xpath = "//*[@data-render-xpath='idm_ClienteDatosVariables.idp_NivelAcademico']/div//ul/li[3]")
    private WebElement seleccionarNivelAcademico ;
    @FindBy(xpath = "//*[@data-render-xpath='idm_ClienteDatosVariables.idp_Ocupacion']/div)"
    private WebElement ocupacion;
    @FindBy(xpath = "//*[@data-render-xpath='idm_ClienteDatosVariables.idp_Ocupacion']/div//ul//*[text()='{0}']")
    private WebElement seleccionarOcupaccion ;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idp_Segmento']/div")
    private WebElement segmento ;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idp_Segmento']//ul/li[contains(text(),'{0}')]")
    private WebElement seleccionarSegmento ;
    @FindBy(xpath = "//*[@id='b9b2380d-3dac-4733-b08c-f0ab397125b3']")
    private WebElement housing ;
    @FindBy(xpath = "//div[@id='dd-b9b2380d-3dac-4733-b08c-f0ab397125b3']/ul/li[3]")
    private WebElement selectHousing;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoContacto.idm_InfoVivienda.idm_Direccion.idp_Pais']//input")
    private WebElement paisResidencia;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoContacto.idm_InfoVivienda.idm_Direccion.idp_Pais']//strong")
    private WebElement seleccionarPaisResidencia;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoContacto.idm_InfoVivienda.idm_Direccion.idp_Departamento']//input")
    private WebElement departamento;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoContacto.idm_InfoVivienda.idm_Direccion.idp_Departamento']//ul/li[1]/a/label")
    private WebElement seleccionarDepartamento;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoContacto.idm_InfoVivienda.idm_Direccion.idp_Ciudad']//div/input")
    private WebElement ciudad ;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoContacto.idm_InfoVivienda.idm_Direccion.idp_Ciudad']//li[1]/a/label")
    private WebElement seleccionarCiudad ;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoContacto.idm_InfoVivienda.idm_Direccion.sDireccionCompleta']//div/input")
    private WebElement direccion;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoContacto.idm_InfoVivienda.idp_Estrato']//div/input")
    private WebElement estrato;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoContacto.idm_InfoVivienda.idp_Estrato']//div/ul/li[contains(text(),'Estrato 4')]")
    private WebElement seleccionarEstrato;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoContacto.sTelefono']//input")
    private WebElement telefono ;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoContacto.idm_InfoVivienda.ITiempoResidencia']//input")
    private WebElement tiempoResidencia ;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoContacto.idm_InfoVivienda.bMarcarDirCorrespondencia']//label[contains(text(),'Si')]")
    private WebElement direccionResidencia ;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoLaboral.sNombreEmpresa']//input")
    private WebElement NombreCompañia;
    @FindBy(xpath = "//div[@data-render-id='e3ddef6a-893e-4e5e-8a7e-1fcd15bb975e']//input")
    private WebElement NIT;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoLaboral.idm_SIM_Direccion.idp_Pais']//input")
    private WebElement paisEmpresa;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoLaboral.idm_SIM_Direccion.idp_Pais']//li[1]/a/label")
    private WebElement seleccionarPaisEmpresa;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoLaboral.idm_SIM_Direccion.idp_Departamento']//input")
    private WebElement departamentoEmpresa;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoLaboral.idm_SIM_Direccion.idp_Departamento']//li[1]/a/label")
    private WebElement seleccionardepartamentoEmpresa;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoLaboral.idm_SIM_Direccion.idp_Ciudad']//input")
    private WebElement ciudadEmpresa;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoLaboral.idm_SIM_Direccion.idp_Ciudad']//li[1]/a/label")
    private WebElement seleccionarCiudadEmpresa;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoLaboral.idm_SIM_Direccion.sDireccionCompleta']//input")
    private WebElement direccionEmpresa;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoLaboral.sTelefono']//input")
    private WebElement telefonoEmpresa;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoLaboral.dFechaIngreso']//input")
    private WebElement fechaIngreso;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoLaboral.idp_TipoContrato']//input")
    private WebElement tipoContrato;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoLaboral.idp_TipoContrato']/div/div[2]/ul/li[contains(text(),'A TERMINO INDEFINDO')]")
    private WebElement seleccionarTipoContrato;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoLaboral.bEmpleadoBancolombia']//div/label[contains(text(),'No')]")
    private WebElement empleadoBancolombia ;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoLaboral.bEmpleadoBancolombia']//label[contains(text(),'Si')]")
    private WebElement tasaEspecial ;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoAdicional.idp_SIM_ClienteDeclarante']//input")
    private WebElement clienteDeclarante ;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoAdicional.idp_SIM_ClienteDeclarante']//ul/li[3]")
    private WebElement seleccionarClienteDeclarante ;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoAdicional.idp_SIM_AgenteRetenedor']//input")
    private WebElement agenteRetenedor ;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoAdicional.idp_SIM_AgenteRetenedor']//ul/li[3]")
    private WebElement seleccionarAgenteRetenedor;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoAdicional.idp_RegimenIVA']//input")
    private WebElement regimenIVA ;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoAdicional.idp_RegimenIVA']//ul/li[3]")
    private WebElement seleccionarIVA ;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoAdicional.idPaisOrigenRecursos']//input")
    private WebElement PaisRecursos;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoAdicional.idPaisOrigenRecursos']//li[1]/a/label")
    private WebElement seleccionarPaisRecursos;
    @FindBy(xpath = "//*[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoAdicional.idCiudadOrigenRecursos']//input")
    private WebElement ciudadRecursos;
    @FindBy(xpath = "//*[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoAdicional.idCiudadOrigenRecursos']//li[1]/a/label[1]")
    private WebElement seleccionarCiudadRecursos;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoFinanciera.idm_IngresosMensuales.cSalarioFijo']//input")
    private WebElement salario ;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.idm_InfoFinanciera.idm_EgresosMensuales.cGastosFamiliares']//input")
    private WebElement gastosFamiliares;
    @FindBy(xpath = "//div[@data-render-xpath='idm_ClienteDatosVariables.BConceptoComercial']//div/label")
    private WebElement sarlaft ;
    @FindBy(xpath = "//span[contains(text(),'Guardar')]")
    private WebElement guardar ;


    public InformacionComplementaria(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
        PageFactory.initElements(driver, this);
    }

      public void esperar()  {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void IngresarInformacionComplementaria() {



    }
}
