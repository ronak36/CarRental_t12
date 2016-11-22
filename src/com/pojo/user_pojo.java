
 class user_pojo
 {


        private String fname;

        private String lname;

        private String pwd;

        private String eid;

        private String phno;

        private String icountry;

        private String istate;

        private String licensestate;
        
        private String exdate;

   
    
    public User()
    {

    }

    public User(String fname,String lname,String pwd,String eid,String phno,String icountry,String istate, String licensestate,String exdate)
    {
        this.fname = fname;

        this.lname = lname;

        this.pwd = pwd;

        this.eid = eid;

        this.phno = phno;

        this.icountry = icountry;

        this.istate = istate;

        this.licensestate = licensestate;

        this.exdate = exdate;
       
    }
    
   
    
    public String getfname()
    {
        return this.fname;
    }
    public String setfname(String fname)
    {
        this.fname = fname;
    }

    public String getlname()
    {
        return this.lname;
    }
     public String setlname(String lname)
    {
        this.lname = lname;
    }

    public String getpwd()
    {
        return this.pwd;
    }
    public String setpwd(String pwd)
    {
        this.pwd=pwd;
    }

    public String geteid()
    {
        return this.eid;
    }
    public String seteid(String eid)
    {
         this.eid=eid;
    }


    public String getphno()
    {
        return this.phno;
    }
    public String setphno(String phno)
    {
        this.phno=phno;
    }

    public String geticountry()
    {
        return this.icountry;
    }
    public String seticountry(String icountry)
    {
        this.seticountry=icountry;
    }

    public String getistate()
    {
        return this.istate;
    }
     public String setistate(String istate)
    {
        this.istate= istate;
    }

    public String getlicensestate()
    {
        return this.licensestate;
    }
    public String setlicensestate()
    {
        this.licensestate=licensestate;
    }

    public String getexdate()
    {
        return this.exdate;
    }
     public String setexdate()
    {
        this.exdate=exdate;
    }

     
}