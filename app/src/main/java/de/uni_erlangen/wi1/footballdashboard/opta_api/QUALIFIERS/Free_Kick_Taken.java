package de.uni_erlangen.wi1.footballdashboard.opta_api.QUALIFIERS;

import de.uni_erlangen.wi1.footballdashboard.opta_api.OPTA_Qualifier;

/**
 * Created by knukro on 5/22/17.
 */

public class Free_Kick_Taken extends OPTA_Qualifier
{
    public Free_Kick_Taken(String value)
    {
        super(value);
    }

    @Override
    public int getId()
    {
        return 0;
    }
}
