//
// This file generated by rdl 1.4.15. Do not modify!
//

package com.yahoo.athenz.zms;
import java.util.List;
import com.yahoo.rdl.*;

//
// Policies - The representation of list of policy objects
//
public class Policies {
    public List<Policy> list;

    public Policies setList(List<Policy> list) {
        this.list = list;
        return this;
    }
    public List<Policy> getList() {
        return list;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != Policies.class) {
                return false;
            }
            Policies a = (Policies) another;
            if (list == null ? a.list != null : !list.equals(a.list)) {
                return false;
            }
        }
        return true;
    }
}
