package k_spring_hibernate.implement;

import k_spring_hibernate.dao.InterfaceDao;
import k_spring_hibernate.dao.InterfaceService;
import k_spring_hibernate.model.Person;

public class ServiceImp implements InterfaceService
{
    private InterfaceDao pdao;

    @Override
    public void register(Person pp)
    {
        pdao.savePerson(pp);
    }

    @Override
    public void zhuanzhang(long yuan, long mubiao, int jine)
    {
        pdao.zhuanzhang(yuan, mubiao, jine);
    }
    //====================================getter & setter

    public InterfaceDao getPdao()
    {
        return pdao;
    }

    public void setPdao(InterfaceDao pdao)
    {
        this.pdao = pdao;
    }

}


