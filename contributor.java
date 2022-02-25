class contributor
{
    private int noOfSkills, cnt, level[];
    private String name, skill[];
    private boolean isFree;
    
    contributor(String name, int noOfSkills)
    {
        this.name= name;
        this.noOfSkills= noOfSkills;
        cnt= 0;
        isFree= true;
        
        level= new int[noOfSkills];
        skill= new String[noOfSkills];
    }

    void addSkill(String skill, int level)
    {
        this.skill[cnt]= skill;
        this.level[cnt++]= level;
    }

    int getPosition_skill(String skill)
    {
        for(int i= 0; i<noOfSkills; i++)
            if(this.skill[i].equalsIgnoreCase(skill))
                return i;
        return -1;
    }

    int getLevel(String skill)
    {
        int pos= getPosition_skill(skill);
        return pos == -1 ? pos : level[pos];
    }

    void assign()
    {
        isFree= false;
    }
    
    boolean isFree()
    {
        return isFree;
    }
    
    void updateSkill(String skill)
    {
        int pos= getPosition_skill(skill);
        if(pos > -1)
            level[pos]++;
    }

    public String toString()
    {
        String output= "";
        for(int i=0; i<noOfSkills; i++)
            output+= skill[i]+"\t"+level[i]+"\n";
        output+= "\n";
        return output;
    }
}