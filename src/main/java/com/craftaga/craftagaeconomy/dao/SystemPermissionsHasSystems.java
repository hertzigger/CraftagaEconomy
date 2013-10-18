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

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Description
 * <p/>
 * Created: 17/09/13 - 21:57
 *
 * @author hertzigger
 */

@javax.persistence.IdClass(com.craftaga.craftagaeconomy.dao.SystemPermissionsHasSystemsPK.class)
@javax.persistence.Table(name = "system_permissions_has_systems", schema = "", catalog = "craftaga_economy")
@Entity
public class SystemPermissionsHasSystems {
    private Long systemPermissionsIdSystemPermissions;

    @javax.persistence.Column(name = "system_permissions_id_system_permissions")
    @Id
    public Long getSystemPermissionsIdSystemPermissions() {
        return systemPermissionsIdSystemPermissions;
    }

    public void setSystemPermissionsIdSystemPermissions(Long systemPermissionsIdSystemPermissions) {
        this.systemPermissionsIdSystemPermissions = systemPermissionsIdSystemPermissions;
    }

    private Long systemsIdSystems;

    @javax.persistence.Column(name = "systems_id_systems")
    @Id
    public Long getSystemsIdSystems() {
        return systemsIdSystems;
    }

    public void setSystemsIdSystems(Long systemsIdSystems) {
        this.systemsIdSystems = systemsIdSystems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SystemPermissionsHasSystems that = (SystemPermissionsHasSystems) o;

        if (systemPermissionsIdSystemPermissions != null ? !systemPermissionsIdSystemPermissions.equals(that.systemPermissionsIdSystemPermissions) : that.systemPermissionsIdSystemPermissions != null)
            return false;
        if (systemsIdSystems != null ? !systemsIdSystems.equals(that.systemsIdSystems) : that.systemsIdSystems != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = systemPermissionsIdSystemPermissions != null ? systemPermissionsIdSystemPermissions.hashCode() : 0;
        result = 31 * result + (systemsIdSystems != null ? systemsIdSystems.hashCode() : 0);
        return result;
    }

    private SystemPermissions systemPermissionsBySystemPermissionsIdSystemPermissions;

    @ManyToOne
    @javax.persistence.JoinColumn(name = "system_permissions_id_system_permissions", referencedColumnName = "id_system_permissions", nullable = false)
    public SystemPermissions getSystemPermissionsBySystemPermissionsIdSystemPermissions() {
        return systemPermissionsBySystemPermissionsIdSystemPermissions;
    }

    public void setSystemPermissionsBySystemPermissionsIdSystemPermissions(SystemPermissions systemPermissionsBySystemPermissionsIdSystemPermissions) {
        this.systemPermissionsBySystemPermissionsIdSystemPermissions = systemPermissionsBySystemPermissionsIdSystemPermissions;
    }

    private Systems systemsBySystemsIdSystems;

    @ManyToOne
    @javax.persistence.JoinColumn(name = "systems_id_systems", referencedColumnName = "id_systems", nullable = false)
    public Systems getSystemsBySystemsIdSystems() {
        return systemsBySystemsIdSystems;
    }

    public void setSystemsBySystemsIdSystems(Systems systemsBySystemsIdSystems) {
        this.systemsBySystemsIdSystems = systemsBySystemsIdSystems;
    }
}
