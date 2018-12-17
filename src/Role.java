
public class Role 
{
	private String roleName;
	private String roleInfo;
	
	public Role(String roleName)
	{
		this.roleName = roleName;
	}
	
	public void addRoleInfo()
	{
		//role info will determine what the player can do each night, and the influence they have 
		//in the game.
		
	}
	
	//everything that a role is able to do 
	public void roleFunctionalityAtNight()
	{
	
	}
	//checks if player role can attack
	public boolean canPlayerAttack()
	{
		String [] attackingRoles = {};
		for(int i = 0; i < attackingRoles.length; i++)
		{
			if(roleName.equals(attackingRoles[i]))
			{
				return true;
			}
		}
		return false;
	}
	
	//checks if a player role can protect other players from being attacked
	public boolean canPlayerProtect()
	{
		String [] protectingRoles = {};
		for(int i = 0; i < protectingRoles.length; i++)
		{
			if(roleName.equals(protectingRoles[i]))
			{
				return true;
			}
		}
		return false;
	}
	

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleInfo() {
		return roleInfo;
	}

	public void setRoleInfo(String roleInfo) {
		this.roleInfo = roleInfo;
	}
}
