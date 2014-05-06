package sk.mathis.stuba.hibernatemapper;
// Generated Apr 29, 2014 5:20:40 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * MdsDeviceModel generated by hbm2java
 */
public class MdsDeviceModel  implements java.io.Serializable {


     private Integer idDeviceModel;
     private MdsDeviceVendor mdsDeviceVendor;
     private String model;
     private Set mdsDevices = new HashSet(0);

    public MdsDeviceModel() {
    }

	
    public MdsDeviceModel(MdsDeviceVendor mdsDeviceVendor, String model) {
        this.mdsDeviceVendor = mdsDeviceVendor;
        this.model = model;
    }
    public MdsDeviceModel(MdsDeviceVendor mdsDeviceVendor, String model, Set mdsDevices) {
       this.mdsDeviceVendor = mdsDeviceVendor;
       this.model = model;
       this.mdsDevices = mdsDevices;
    }
   
    public Integer getIdDeviceModel() {
        return this.idDeviceModel;
    }
    
    public void setIdDeviceModel(Integer idDeviceModel) {
        this.idDeviceModel = idDeviceModel;
    }
    public MdsDeviceVendor getMdsDeviceVendor() {
        return this.mdsDeviceVendor;
    }
    
    public void setMdsDeviceVendor(MdsDeviceVendor mdsDeviceVendor) {
        this.mdsDeviceVendor = mdsDeviceVendor;
    }
    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    public Set getMdsDevices() {
        return this.mdsDevices;
    }
    
    public void setMdsDevices(Set mdsDevices) {
        this.mdsDevices = mdsDevices;
    }




}


