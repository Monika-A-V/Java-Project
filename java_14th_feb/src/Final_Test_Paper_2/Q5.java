package Final_Test_Paper_2;

//For IceCream shop show use of Factory pattern

interface IceCream 
{
    void prepare();
    void serve();
}

class ChocolateIceCream implements IceCream 
{
    @Override
    public void prepare() 
    {
        System.out.println("Preparing Chocolate Ice Cream");
    }

    @Override
    public void serve() 
    {
        System.out.println("Serving Chocolate Ice Cream");
    }
}

class VanillaIceCream implements IceCream 
{
    @Override
    public void prepare() 
    {
        System.out.println("Preparing Vanilla Ice Cream");
    }

    @Override
    public void serve() 
    {
        System.out.println("Serving Vanilla Ice Cream");
    }
}

class IceCreamFactory 
{
    public IceCream createIceCream(String type)
    {
        if (type.equalsIgnoreCase("chocolate"))
        {
            return new ChocolateIceCream();
        } else if (type.equalsIgnoreCase("vanilla")) 
        {
            return new VanillaIceCream();
        } 
        else 
        {
            throw new IllegalArgumentException("Invalid ice cream type: " + type);
        }
    }
}

public class Q5 
{

	public static void main(String[] args) 
	{

		IceCreamFactory factory = new IceCreamFactory();

        IceCream chocolateIceCream = factory.createIceCream("chocolate");
        chocolateIceCream.prepare();
        chocolateIceCream.serve();

        IceCream vanillaIceCream = factory.createIceCream("vanilla");
        vanillaIceCream.prepare();
        vanillaIceCream.serve();
    }
}
