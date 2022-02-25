class project
{
    private contributor[] worker;
    private String name, skill[];
    private int days, score, bestBefore, numberOfRoles, level[], cnt;

    project(String name, int days, int score, int bestBefore, int numberOfRoles)
    {
        this.name= name;
        this.days= days;
        this.score= score;
        this.bestBefore= bestBefore;
        this.numberOfRoles= numberOfRoles;

        cnt= 0;

        worker= new contributor[numberOfRoles];
        skill= new String[numberOfRoles];
        level= new int[numberOfRoles];
    }    

    int getScore()
    {
        return score;
    }

    int getBestBefore()
    {
        return bestBefore;
    }
    
    contributor[] getTeam()
    {
        return worker;
    }
    
    void addRequirement(String skill, int level)
    {
        this.skill[cnt]= skill;
        this.level[cnt++]= level;
    }
    //fix later;
    boolean assignContributors(contributor[] workFroce)
    {
        String maybe[]= new String[workFroce.length];
        int i, j, cnt= 0;
        for(i=0; i<numberOfRoles; i++)
        {
            for(j= 0; j<workFroce.length; j++)
            {
                int level= workFroce[j].getLevel(skill[i]);
                if(level >= this.level[i] && workFroce[j].isFree())
                {
                    workFroce[i].assign();
                    worker[this.cnt++]= workFroce[j];
                    if(level+1 == this.level[i])
                        maybe[cnt++]= null;
                }
            }
        }

        for(i=0; i<cnt; i++)
        {

        }
        return false;
    }

    public String toString()
    {
        String output= name+":\n";
        for(int i=0; i<numberOfRoles; i++)
            output+= skill[i]+"\t"+level[i]+"\n";
        output+= "\n";
        return output;
    }
}