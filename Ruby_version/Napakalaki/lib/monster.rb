# begin monster.rb
#encoding: utf-8s

# Clase Monstruo que representa una carta de monstruo
class Monster
  
  # Consultores / datos miembro
  # -------------------------------------------------------
  
  attr_reader :name           # Nombre del monstruo
  attr_reader :combatLevel    # Poder de combate
  attr_reader :prize          # Recompensa
  attr_reader :badConsequence # Mal rollo
  
  # -------------------------------------------------------
  
  # Constructor
  # -------------------------------------------------------
  
  def initialize(name, combatLevel, prize, badConsequence)
    @name = name
    @combatLevel = combatLevel
    @prize = prize
    @badConsequence = badConsequence
  end
  
  # -------------------------------------------------------
  
  # Métodos
  # -------------------------------------------------------
  
  # Convierte a string
  def to_s
    "Nombre: #{@name}\n Poder de combate: #{@combatLevel}\n 
     Recompensa: #{@prize}\n Mal rollo: #{@badConsequence}"
  end
  
  # -------------------------------------------------------
end

# end monster.rb