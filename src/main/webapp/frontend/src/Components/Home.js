import React, { Component } from 'react';
import { Header } from './Components/Header';
import { Footer } from './Components/Footer';

class Home extends Component {
  render() {
    return (
      <div>
        <div className="App-header">
          <Header />
        </div>
        <div className="App-footer">
          <Footer />
        </div>
      </div>
    );
  }
}

export default Home;
