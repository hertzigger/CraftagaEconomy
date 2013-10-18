package com.craftaga.craftagaeconomy.dao;/**
 * CraftagaEconomy Plugin for bukkit
 * Copyright (C) 2013 Craftaga.com <hertzigger@craftaga.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

/**
 * Description
 * <p/>
 * Created: 17/09/13 - 21:57
 *
 * @author hertzigger
 */

@javax.persistence.Table(name = "system_permissions", schema = "", catalog = "craftaga_economy")
@Entity
public class SystemPermissions {
    private Long idSystemPermissions;

    @javax.persistence.Column(name = "id_system_permissions")
    @Id
    public Long getIdSystemPermissions() {
        return idSystemPermissions;
    }

    public void setIdSystemPermissions(Long idSystemPermissions) {
        this.idSystemPermissions = idSystemPermissions;
    }

    private String name;

    @javax.persistence.Column(name = "name")
    @Basic
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SystemPermissions that = (SystemPermissions) o;

        if (idSystemPermissions != null ? !idSystemPermissions.equals(that.idSystemPermissions) : that.idSystemPermissions != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSystemPermissions != null ? idSystemPermissions.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    private Collection<SystemPermissionsHasSystems> systemPermissionsHasSystemsesByIdSystemPermissions;

    @OneToMany(mappedBy = "systemPermissionsBySystemPermissionsIdSystemPermissions")
    public Collection<SystemPermissionsHasSystems> getSystemPermissionsHasSystemsesByIdSystemPermissions() {
        return systemPermissionsHasSystemsesByIdSystemPermissions;
    }

    public void setSystemPermissionsHasSystemsesByIdSystemPermissions(Collection<SystemPermissionsHasSystems> systemPermissionsHasSystemsesByIdSystemPermissions) {
        this.systemPermissionsHasSystemsesByIdSystemPermissions = systemPermissionsHasSystemsesByIdSystemPermissions;
    }
}
