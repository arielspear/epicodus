puts "Please, enter a number."

num = gets.to_i
i = 0

puts "Thanks, let's play ping-pong."

while i < num do

  i += 1
  if (i % 3 == 0) && (i % 5 == 0)
    puts "Ping-Pong"
  elsif (i % 3 == 0)
    puts "Ping"
  elsif (i % 5 == 0)
    puts "Pong"
  else
  puts (i)
  end

end
