import React, { Component } from 'react';

export class Header extends Component {
  render() {
    return (
      <div className="w3-col">
        <div className="w3-container w3-center w3-quarter">Options</div>
        <div className="w3-container w3-center w3-half">Indigo</div>
        <div className="w3-container w3-center w3-quarter">Login Things</div>
      </div>
    );
  }
}
