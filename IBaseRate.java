package bankaccountapp;

public interface IBaseRate {
	default double getBaseRate()
	{
		return 5.5;
	}

}
