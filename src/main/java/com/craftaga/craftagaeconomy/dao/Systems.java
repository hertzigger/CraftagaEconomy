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

@Entity
public class Systems {
    private Long idSystems;

    @javax.persistence.Column(name = "id_systems")
    @Id
    public Long getIdSystems() {
        return idSystems;
    }

    public void setIdSystems(Long idSystems) {
        this.idSystems = idSystems;
    }

    private String nameSingular;

    @javax.persistence.Column(name = "name_singular")
    @Basic
    public String getNameSingular() {
        return nameSingular;
    }

    public void setNameSingular(String nameSingular) {
        this.nameSingular = nameSingular;
    }

    private String namePlural;

    @javax.persistence.Column(name = "name_plural")
    @Basic
    public String getNamePlural() {
        return namePlural;
    }

    public void setNamePlural(String namePlural) {
        this.namePlural = namePlural;
    }

    private Integer tierTotal;

    @javax.persistence.Column(name = "tier_total")
    @Basic
    public Integer getTierTotal() {
        return tierTotal;
    }

    public void setTierTotal(Integer tierTotal) {
        this.tierTotal = tierTotal;
    }

    private Long parent;

    @javax.persistence.Column(name = "parent")
    @Basic
    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Systems systems = (Systems) o;

        if (idSystems != null ? !idSystems.equals(systems.idSystems) : systems.idSystems != null) return false;
        if (namePlural != null ? !namePlural.equals(systems.namePlural) : systems.namePlural != null) return false;
        if (nameSingular != null ? !nameSingular.equals(systems.nameSingular) : systems.nameSingular != null)
            return false;
        if (parent != null ? !parent.equals(systems.parent) : systems.parent != null) return false;
        if (tierTotal != null ? !tierTotal.equals(systems.tierTotal) : systems.tierTotal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSystems != null ? idSystems.hashCode() : 0;
        result = 31 * result + (nameSingular != null ? nameSingular.hashCode() : 0);
        result = 31 * result + (namePlural != null ? namePlural.hashCode() : 0);
        result = 31 * result + (tierTotal != null ? tierTotal.hashCode() : 0);
        result = 31 * result + (parent != null ? parent.hashCode() : 0);
        return result;
    }

    private Collection<SystemPermissionsHasSystems> systemPermissionsHasSystemsesByIdSystems;

    @OneToMany(mappedBy = "systemsBySystemsIdSystems")
    public Collection<SystemPermissionsHasSystems> getSystemPermissionsHasSystemsesByIdSystems() {
        return systemPermissionsHasSystemsesByIdSystems;
    }

    public void setSystemPermissionsHasSystemsesByIdSystems(Collection<SystemPermissionsHasSystems> systemPermissionsHasSystemsesByIdSystems) {
        this.systemPermissionsHasSystemsesByIdSystems = systemPermissionsHasSystemsesByIdSystems;
    }

    private Collection<SystemsHasWage> systemsHasWagesByIdSystems;

    @OneToMany(mappedBy = "systemsBySystemsIdSystems")
    public Collection<SystemsHasWage> getSystemsHasWagesByIdSystems() {
        return systemsHasWagesByIdSystems;
    }

    public void setSystemsHasWagesByIdSystems(Collection<SystemsHasWage> systemsHasWagesByIdSystems) {
        this.systemsHasWagesByIdSystems = systemsHasWagesByIdSystems;
    }
}
